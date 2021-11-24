package hw.tuan2.hw4;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeList {

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

    public static void calculate(int bound) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 2; i <= bound; i++) { // 1 is NOT a prime number

            if (isPrime(i)) {
                arr.add(i);
                System.out.println(i);
            }
        }

        double counter = arr.size();

        double percent = counter / bound * 100.00;

        if (arr.isEmpty()) {
            System.out.println("[No prime found]");
        } else if (arr.size() == 1) {
            System.out.printf("[1 prime found (%.2f%%)]%n", percent);
        } else {
            System.out.printf("[%d primes found (%.2f%%)]%n", arr.size(), percent);
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int upBound;

        System.out.print("Enter the upper bound: ");
        upBound = scan.nextInt();

        calculate(upBound);
    }
}
