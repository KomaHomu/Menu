package hw.tuan1.hw3;

import java.util.Scanner;

public class RadixN2Dec {
    public static void printRadixN2Dec(String str, int radix) {

        int toDec;

        toDec = Integer.parseInt(str, radix);
        System.out.println("The equivalent decimal number: " + toDec);
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        String str;
        int radix;

        System.out.print("Enter the radix: ");
        radix = scan.nextInt();
        System.out.print("Enter the string: ");
        str = scan.next();

        printRadixN2Dec(str, radix);

        //scan.close();
    }
}
