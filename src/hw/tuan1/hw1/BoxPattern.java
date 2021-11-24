package hw.tuan1.hw1;

import java.util.Scanner;

public class BoxPattern {

    public static void boxPatternA(int size) {

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == 1 || col == size || row == 1 || row == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" (a)\n");

    }

    public static void boxPatternB(int size) {

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == row || row == 1 || row == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" (b)\n");

    }

    public static void boxPatternC(int size) {

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == (size - row) || row == 1 || row == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" (c)\n");

    }

    public static void boxPatternD(int size) {

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                if (col == (size - row) || col == row || row == 1 || row == size) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(" (d)\n");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        boxPatternA(size);
        boxPatternB(size);
        boxPatternC(size);
        boxPatternD(size);

        //scan.close();
    }
}
