package hw;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class SimpleMenu { //incomplete

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String packageName = "hw";
        String temp;
        int choice;

        //switch-case here

        //example
        do {
            // menu interface here...
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    temp = ".tuan1";
                    break;
                case 2:
                    temp = ".tuan2";
                    break;
                case 0:
                    temp = "";
                    break;
                default:
                    System.out.println("Incorrect input.");
                    temp = "";
                    break;
                //blah blah blah...
                //at the end of package, set choice as 0 to terminate loop
            }
            packageName += temp;
        } while (choice != 0);

        Class<?> inputClass;

        //packageName = "hw.tuan1.hw1.BoxPattern"; // test

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
}
