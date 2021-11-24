package hw.tuan1.hw1;

import java.util.Scanner;

public class HillPattern {
    public static void hillPatternA(int size) {

        for (int row = 1; row <= size; row++) {
            //Print blank
            for (int blank = size; blank > row; blank--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (a)\n");

    }

    public static void hillPatternB(int size) {

        for (int row = size; row >= 1; row--) {
            //Print blank
            for (int blank = 0; blank < (size - row); blank++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (b)\n");

    }

    public static void hillPatternC(int size) {

        for (int row = 1; row <= size; row++) {
            //Print blank
            for (int blank = size; blank > row; blank--) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        for (int row = size - 1; row >= 1; row--) {
            //Print blank
            System.out.print(" ");
            for (int blank = 0; blank < (size - 1 - row); blank++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= (row * 2 - 1); col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (c)\n");

    }

    public static void hillPatternD(int size) {

        int numCol = size * 2 - 1;

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        for (int row = size - 1; row > 0; row--) {
            for (int col = 1; col <= numCol; col++) {
                if ((row + col > size + 1) && (row > col - size + 1)) {
                    System.out.print(" ");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
        System.out.println(" (d)\n");
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        hillPatternA(size);
        hillPatternB(size);
        hillPatternC(size);
        hillPatternD(size);

    }
}
