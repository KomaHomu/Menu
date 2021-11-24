package hw;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);
    private static final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

    private static File[] getPackageContent(String packageName) throws IOException {

        List<File> list = new ArrayList<>();
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);
        URL url;
        File temp;
        File[] tempList;

        while (resources.hasMoreElements()) {
            url = resources.nextElement();
            temp = new File(url.getFile());
            tempList = temp.listFiles();
            if (tempList == null) {
                continue;
            }

            list.addAll(Arrays.asList(tempList));
        }

        return list.toArray(new File[]{});
    }

    private static File[] getPackageName(String packageName) throws IOException {

        List<File> nameList = new ArrayList<>();
        File[] list = getPackageContent(packageName);
        for (File file : list) {
            if (file.isDirectory()) {
                nameList.add(file);
            }
        }

        return nameList.toArray(new File[]{});
    }

    private static Class<?>[] getClasses(String packageName) throws ClassNotFoundException, IOException {

        List<Class<?>> classes = new ArrayList<>();
        File[] list = getPackageContent(packageName);
        for (File file : list) {
            classes.addAll(findClasses(file, packageName));
        }

        return classes.toArray(new Class[0]);
    }

    private static List<Class<?>> findClasses(File file, String packageName) throws ClassNotFoundException {

        List<Class<?>> classes = new ArrayList<>();

        if (file.isDirectory()) {
            assert !file.getName().contains(".");
            classes.addAll(findClasses(file, packageName + "." + file.getName()));
        } else if (file.getName().endsWith(".class")) {
            classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
        }

        return classes;
    }

    private static int getInput(int counter) {
        int input;

        while (true) {

            System.out.print("Your choice: ");
            input = sc.nextInt();

            if (input < 0 || input > counter) {
                System.out.println("Incorrect input. Please try again.");
            } else {
                return input;
            }
        }
    }

    private static void chooseClasses(String packageName) {
        int choice;
        int counter = 0;

        Class<?>[] allClasses;

        try {
            allClasses = getClasses(packageName);

            System.out.println("-----MENU-----");
            for (Class<?> allClass : allClasses) {
                counter++;
                System.out.println(counter + ") " + allClass.getSimpleName());
            }
            System.out.println("0) Exit");
            System.out.println("--------------");
            choice = getInput(counter);

            if (choice != 0) {
                packageName = allClasses[choice - 1].getName();
                runClass(packageName);
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void runClass(String packageName) {
        Class<?> inputClass;

        try { // run class
            inputClass = Class.forName(packageName);
            Object obj = inputClass.getDeclaredConstructor().newInstance();
            if (inputClass.isInstance(obj)) {
                inputClass.getMethod("main", String[].class).invoke(obj, (Object) null);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Not runnable file. Return to main menu.");
        }
    }

    private static void runApp() {
        String packageName = "hw"; //initializer
        int counter = 0;
        int choice;

        File[] packageContent;

        while (true) {
            try {
                packageContent = getPackageName(packageName);
                if (packageContent.length == 0) {
                    chooseClasses(packageName); //begin choosing classes
                    packageName = "hw"; // reset pathname
                    continue;
                }

                System.out.println("-----MENU-----");
                for (File file : packageContent) {
                    counter++;
                    System.out.println(counter + ") " + file.getName());
                }
                System.out.println("0) Exit");
                System.out.println("--------------");
                choice = getInput(counter);

                if (choice != 0) {
                    packageName = packageName + "." + packageContent[choice - 1].getName();
                } else {
                    break;
                }
                counter = 0; //reset counter
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        runApp();

        sc.close();
    }
}
