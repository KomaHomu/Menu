package hw.tuan1.hw1;

import java.util.Scanner;

public class CheckerPattern {
    public static void printPattern(int size) {

        for (int row = 1; row <= size; row++) {
            if (row % 2 == 0) {
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        printPattern(size);

        //scan.close();
    }
}
