package hw;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.*;

public class Menu {

    private static final Scanner sc = new Scanner(System.in);

    private static Class<?>[] getClasses(String packageName) throws ClassNotFoundException, IOException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        assert classLoader != null;
        String path = packageName.replace(".", "/");
        Enumeration<URL> resources = classLoader.getResources(path);
        List<File> dirs = new ArrayList<>();
        while (resources.hasMoreElements()) {
            URL resource = resources.nextElement();
            dirs.add(new File(resource.getFile()));
        }
        ArrayList<Class<?>> classes = new ArrayList<>();
        for (File dir : dirs) {
            classes.addAll(findClasses(dir, packageName));
        }

        return classes.toArray(new Class[0]);
    }

    private static List<Class<?>> findClasses(File directory, String packageName) throws ClassNotFoundException {
        List<Class<?>> classes = new ArrayList<>();
        if (!directory.exists()) {
            return classes;
        }
        File[] files = directory.listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isDirectory()) {
                assert !file.getName().contains(".");
                classes.addAll(findClasses(file, packageName + "." + file.getName()));
            } else if (file.getName().endsWith(".class")) {
                classes.add(Class.forName(packageName + '.' + file.getName().substring(0, file.getName().length() - 6)));
            }
        }

        return classes;
    }

    private static File[] getPackageContent(String packageName) throws IOException {
        List<File> list = new ArrayList<>();
        String path = packageName.replace(".", "/");
        Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(path);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            File dir = new File(url.getFile());
            for (File file : Objects.requireNonNull(dir.listFiles())) {
                if (file.isDirectory()) {
                    list.add(file);
                }
            }
        }
        
        return list.toArray(new File[]{});
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

    private static void classes(String packageName) {
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
                inputClass.getMethod("run").invoke(obj);
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println("Not runnable file. Return to main menu.");
            //e.printStackTrace();
        }
    }

    private static void runApp() {
        String packageName = "hw"; //initializer
        int counter = 0;
        int choice;

        File[] packageContent;

        while (true) {
            try {
                packageContent = getPackageContent(packageName);

                if (packageContent.length == 0) {
                    classes(packageName); //begin searching for classes

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

        //tests
        /*try {
            File[] packageContent = getPackageContent("hw");
            for (File file : packageContent) {
                System.out.println(file.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            Class<?>[] allClasses = getClasses("hw.tuan1.hw1");
            for (Class<?> allClass : allClasses) {
                System.out.println(allClass.getSimpleName());
            }
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }*/

        /*try {
            Class<?> inputClass = Class.forName("hw.tuan1.hw1.BoxPattern");
            Object obj = inputClass.getDeclaredConstructor().newInstance();
            if (inputClass.isInstance(obj)) {
                inputClass.getMethod("run").invoke(obj);
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }*/

        sc.close();
    }
}
