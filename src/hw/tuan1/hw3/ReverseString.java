package hw.tuan1.hw3;

import java.util.Scanner;

public class ReverseString {
    public static void printReverse(String ipStr) {

        int strIndex;

        strIndex = ipStr.length();

        System.out.print("The reversed string: ");
        for (int index = strIndex - 1; index >= 0; index--) {
            System.out.print(ipStr.charAt(index));
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String ipStr;

        System.out.print("Enter a string: ");
        ipStr = scan.next();

        printReverse(ipStr);

        //scan.close();
    }
}
