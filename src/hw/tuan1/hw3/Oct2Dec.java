package hw.tuan1.hw3;

import java.util.Scanner;

public class Oct2Dec {
    public static void printOctToDec(String str) {

        int toDec;

        toDec = Integer.parseInt(str, 8);
        System.out.println("The equivalent decimal number: " + toDec);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str;

        System.out.print("Enter an octal string: ");
        str = scan.nextLine();

        printOctToDec(str);

        //scan.close();
    }
}
