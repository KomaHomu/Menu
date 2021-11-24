package hw.tuan1.hw3;

import java.util.Scanner;

public class CheckHexStr {
    public static boolean isHex(String text) {
        int strLength = text.length();
        char testChar;

        for (int index = 0; index < strLength; index++) {
            testChar = text.charAt(index);
            if (!((testChar >= '0' && testChar <= '9') || (testChar >= 'A' && testChar <= 'F') || (testChar >= 'a' && testChar <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String text;

        System.out.print("Enter a hex string: ");
        text = scan.nextLine();

        if (isHex(text)) {
            System.out.println(text + "is a hex string.");
        } else {
            System.out.println(text + "is NOT a hex string.");
        }

        //scan.close();
    }
}
