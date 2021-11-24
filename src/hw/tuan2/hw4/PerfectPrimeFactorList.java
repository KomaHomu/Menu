package hw.tuan2.hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectPrimeFactorList {

    public static boolean isPrime(int aPosInt) {

        if (aPosInt <= 1) {
            return false;
        }

        for (int i = 2; i < aPosInt; i++) {
            if (aPosInt % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int productOfDivisor(int number) {

        int product = 1;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0 && isPrime(i)) {
                product *= i;
            }
        }

        return product;
    }

    public static boolean isProductOfPrimeFactors(int aPosInt) {

        return productOfDivisor(aPosInt) == aPosInt;
    }

    public static void calculate(int bound) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= bound; i++) { // again, 1 is NOT a prime number

            if (isProductOfPrimeFactors(i)) {
                arr.add(i);
                System.out.print(i + " ");
            }
        }

        double counter = arr.size();

        double percent = counter / bound * 100.00;

        System.out.println("These numbers are equal to the product of prime factors: ");
        if (arr.isEmpty()) {
            System.out.println("[No number found]");
        } else if (arr.size() == 1) {
            System.out.printf("[1 number found (%.2f%%)]%n", percent);
        } else {
            System.out.printf("[%d numbers found (%.2f%%)]%n", arr.size(), percent);
        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        int upBound;

        System.out.print("Enter the upper bound: ");
        upBound = scan.nextInt();

        calculate(upBound);
    }
}
