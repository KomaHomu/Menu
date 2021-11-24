package hw.tuan1.hw3;

import java.util.Scanner;

public class TestPalindromicPhrase {

    public static boolean isPalindrome(String text) {

        text = text.toUpperCase();

        int fIdx = 0; //forwards' index
        int bIdk = text.length() - 1; //backwards' index
        char forwardChar = text.charAt(fIdx);
        char backwardChar = text.charAt(bIdk);

        while (fIdx <= bIdk) {
            while (!Character.isLetter(forwardChar)) {
                fIdx++;
                forwardChar = text.charAt(fIdx);
            }
            while (!Character.isLetter(backwardChar)) {
                bIdk--;
                backwardChar = text.charAt(bIdk);
            }
            if (forwardChar != backwardChar) {
                return false;
            }
            fIdx++;
            bIdk--;
        }
        return true;
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        String text;

        System.out.print("Enter a string: ");
        text = scan.nextLine(); // change back to scan.next() if scanning single word

        if (isPalindrome(text)) {
            System.out.println(text + " is a palindrome.");
        } else {
            System.out.println(text + " is NOT a palindrome.");
        }

        //scan.close();
    }
}
