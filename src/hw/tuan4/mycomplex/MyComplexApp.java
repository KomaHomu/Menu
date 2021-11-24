package hw.tuan4.mycomplex;

import java.util.Scanner;

public class MyComplexApp {

    public static void printMag(MyComplex complex) {
        if (complex == null) {
            return;
        }

        System.out.println("Complex " + complex + "'s magnitude is: " + complex.magnitude());
    }

    public static void printSum(MyComplex complex1, MyComplex complex2) {
        if (complex1 == null || complex2 == null) {
            return;
        }

        System.out.print(complex1 + " + " + complex2 + " = ");
        System.out.print(complex1.add(complex2));
        System.out.println("\nNew complex number 1 is: " + complex1 + "\n");
    }

    public static void printSumNew(MyComplex complex1, MyComplex complex2) {
        if (complex1 == null || complex2 == null) {
            return;
        }

        System.out.println(complex1 + " + " + complex2 + " = " + complex1.addNew(complex2) + " (result-only)\n");
    }

    public static void printEquals(MyComplex complex1, MyComplex complex2) {
        if (complex1 == null || complex2 == null) {
            return;
        }

        String isEqual = "NOT ";

        if (complex1.equals(complex2)) {
            isEqual = "";
        }

        System.out.println(complex1 + " is " + isEqual + "equal to " + complex2 + "\n");
    }

    public static void printPure(MyComplex complex) {
        if (complex == null) {
            return;
        }

        String isPure = "NOT ";

        if (complex.isReal()) {
            isPure = "";
        }
        System.out.println(complex + " is " + isPure + "a pure real number");
        if (complex.isImaginary()) {
            isPure = "";
        }
        System.out.println(complex + " is " + isPure + "a pure imaginary number\n");
    }

    public static double[] input() {

        double[] result = new double[2];

        Scanner scan = new Scanner(System.in);

        String input;
        String[] split;
        boolean done = false;

        while (!done) {
            try {
                input = scan.nextLine();
                split = input.split(" ");

                result[0] = Double.parseDouble(split[0]);
                result[1] = Double.parseDouble(split[1]);
                done = true;
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                System.out.print("Invalid input. Please re-enter: ");
            }
        }

        return result;
    }

    public static void main(String[] args) {

        double[] complex;

        System.out.print("Enter complex number 1 (real and imaginary part): ");
        complex = input();
        MyComplex complex1 = new MyComplex(complex[0], complex[1]);
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        complex = input();
        MyComplex complex2 = new MyComplex(complex[0], complex[1]);

        System.out.println("Number 1 is: " + complex1);
        printPure(complex1);
        System.out.println("Number 2 is: " + complex2);
        printPure(complex2);

        printEquals(complex1, complex2);

        printMag(complex1);
        printMag(complex2);
        System.out.println();

        printSumNew(complex1, complex2);
        printSum(complex1, complex2);
    }
}
