package hw.tuan1.hw3;

import java.util.Scanner;

public class Hex2Dec {
    public static void printHexToDec(String str) {

        int toDec;

        if (str.matches("^[a-fA-F0-9]+")) {
            toDec = Integer.parseInt(str, 16);
            System.out.println("The equivalent decimal number: " + toDec);
        } else {
            System.out.println("error: invalid hexadecimal string: " + str);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str;

        System.out.print("Enter a hexadecimal string: ");
        str = scan.nextLine();

        printHexToDec(str);

        //scan.close();

    }
}
