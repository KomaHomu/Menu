package hw.tuan2.hw4;

import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) {

        int temp;

        if (a <= 0 || b <= 0) {
            return -1;
        }

        if (a < b) { // switch a and b positions if a < b
            temp = b;
            b = a;
            a = temp;
        }

        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int result;

        System.out.print("Enter the first number: ");
        num1 = scan.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scan.nextInt();

        result = gcd(num1, num2);

        if (result == -1) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("The greatest common divisor between the 2 numbers: " + result);
        }

    }
}
