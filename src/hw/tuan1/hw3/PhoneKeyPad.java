package hw.tuan1.hw3;

import java.util.Scanner;

public class PhoneKeyPad {
    public static void printKeyPad(String ipStr) {

        int strLength;
        int digit = 0;
        char testChar;

        strLength = ipStr.length();

        for (int index = 0; index <= strLength - 1; index++) {

            testChar = ipStr.charAt(index);

            /*if (testChar >= 'A' && testChar <= 'C') {
                digit = 2;
            } else if (testChar >= 'D' && testChar <= 'F') {
                digit = 3;
            } else if (testChar >= 'G' && testChar <= 'I') {
                digit = 4;
            } else if (testChar >= 'J' && testChar <= 'L') {
                digit = 5;
            } else if (testChar >= 'M' && testChar <= 'O') {
                digit = 6;
            } else if (testChar >= 'P' && testChar <= 'S') {
                digit = 7;
            } else if (testChar >= 'T' && testChar <= 'V') {
                digit = 8;
            } else if (testChar >= 'W' && testChar <= 'Z') {
                digit = 9;
            } else {
                System.out.println("Error.");
                break;
            }*/

            switch (testChar) {
                case 'A', 'B', 'C' -> digit = 2;
                case 'D', 'E', 'F' -> digit = 3;
                case 'G', 'H', 'I' -> digit = 4;
                case 'J', 'K', 'L' -> digit = 5;
                case 'M', 'N', 'O' -> digit = 6;
                case 'P', 'Q', 'R', 'S' -> digit = 7;
                case 'T', 'U', 'V' -> digit = 8;
                case 'W', 'X', 'Y', 'Z' -> digit = 9;
                default -> System.out.println("Error.");
            }

            System.out.print(digit);

        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        String ipStr;

        System.out.print("Enter a string: ");
        ipStr = scan.next().toUpperCase();

        System.out.print("Num-pad equivalent: ");

        printKeyPad(ipStr);

        //scan.close();

    }
}
