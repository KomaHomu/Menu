package hw.tuan1.hw3;

import java.util.Scanner;

public class Bin2Dec {
    public static void printBinToDec(String str) {

        int toDec;

        if (str.matches("^[01]*")) {
            toDec = Integer.parseInt(str, 2);
            System.out.println("The equivalent decimal number: " + toDec);
        } else {
            System.out.println("error: invalid binary string: " + str);
        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        String str;

        System.out.print("Enter a binary string: ");
        str = scan.nextLine();

        printBinToDec(str);

        //scan.close();
    }
}
