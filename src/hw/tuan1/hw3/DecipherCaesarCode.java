package hw.tuan1.hw3;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static void printDeciphredCode(String text) {

        int strLength;
        char testChar;

        strLength = text.length();

        System.out.print("The plaintext string is: ");
        for (int index = 0; index < strLength; index++) {
            testChar = text.charAt(index);

            if (testChar >= 'D' && testChar <= 'Z') {
                testChar -= 3;
            } else if (testChar >= 'A' && testChar <= 'C') {
                testChar += 23;
            } else {
                System.out.print("Error.");
            }

            System.out.print(testChar);
        }
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        String text;

        System.out.print("Enter a ciphered string: ");
        text = scan.next().toUpperCase();

        printDeciphredCode(text);

        //scan.close();
    }
}
