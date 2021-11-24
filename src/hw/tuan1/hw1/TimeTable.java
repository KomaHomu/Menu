package hw.tuan1.hw1;

import java.util.Scanner;

public class TimeTable {
    public static void printTimeTable(int size) {
        System.out.print(" * |"); //header
        for (int row = 1; row <= size; row++) {
            System.out.printf("%4d", row);
        }
        System.out.println();
        for (int row = 1; row <= size; row++) {
            System.out.print("-----");
        }
        System.out.println();

        for (int row = 1; row <= size; row++) { //table
            System.out.printf("%2d |", row);
            for (int col = 1; col <= size; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        printTimeTable(size);

        //scan.close();

    }
}
