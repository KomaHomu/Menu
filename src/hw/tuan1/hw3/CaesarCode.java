package hw.tuan1.hw3;

import java.util.Scanner;

public class CaesarCode {
    public static void printCaesarCode(String text) {

        int strLength;
        char testChar;

        strLength = text.length();

        System.out.print("The ciphered string is: ");
        for (int index = 0; index < strLength; index++) {
            testChar = text.charAt(index);

            if (testChar >= 'A' && testChar <= 'W') {
                testChar += 3;
            } else if (testChar >= 'X' && testChar <= 'Z') {
                testChar -= 23;
            } else {
                System.out.print("Error.");
            }

            System.out.print(testChar);
        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        String text;

        System.out.print("Enter a string: ");
        text = scan.next().toUpperCase();

        printCaesarCode(text);

        //scan.close();
    }
}
