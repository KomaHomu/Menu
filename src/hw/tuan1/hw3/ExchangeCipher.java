package hw.tuan1.hw3;

import java.util.Scanner;

public class ExchangeCipher {
    public static void printExchangedCipher(String text) {

        final int maxChar = 155; //A + Z

        int strLength;
        char testChar;
        char cipheredChar;

        strLength = text.length();

        System.out.print("The ciphered string is: ");
        for (int index = 0; index < strLength; index++) {
            testChar = text.charAt(index);
            cipheredChar = (char) (maxChar - testChar);
            System.out.print(cipheredChar);
        }
    }

    public void run() {
        Scanner scan = new Scanner(System.in);

        String text;

        System.out.print("Enter a plaintext string: ");
        text = scan.next().toUpperCase();

        printExchangedCipher(text);

        //scan.close();
    }
}
