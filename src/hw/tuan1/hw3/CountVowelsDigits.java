package hw.tuan1.hw3;

import java.util.Scanner;

public class CountVowelsDigits {
    public static void printVowelDigit(String ipStr) {

        char testChar;
        int strLength;
        int vowelCount = 0;
        int digitCount = 0;
        double vowelPercentage;
        double digitPercentage;

        strLength = ipStr.length();

        for (int index = strLength - 1; index >= 0; index--) {
            testChar = ipStr.charAt(index);
            if (Character.isDigit(testChar)) {
                digitCount++; //add if encounter digit
            }
            if (testChar == 'a' || testChar == 'i' || testChar == 'u' || testChar == 'e' || testChar == 'o') {
                vowelCount++; //add if encounter vowel
            }
        }
        vowelPercentage = (vowelCount * 100.00) / (strLength);
        digitPercentage = (digitCount * 100.00) / (strLength);

        System.out.printf("Number of vowels: %.2f%%%n", vowelPercentage);
        System.out.printf("Number of digits: %.2f%%", digitPercentage);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ipStr;

        System.out.print("Enter a string: ");
        ipStr = scan.next().toLowerCase();

        printVowelDigit(ipStr);

        //scan.close();
    }
}
