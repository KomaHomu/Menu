package hw.tuan1.hw1;

import java.util.Scanner;

public class TriangularPattern {

    public static void triangularPatternA(int size) {

        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (a)\n");

    }

    public static void triangularPatternB(int size) {

        for (int row = size; row >= 1; row--) {
            for (int col = row; col >= 1; col--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (b)\n");

    }

    public static void triangularPatternC(int size) {

        for (int row = size; row >= 1; row--) {
            for (int blank = (size - row); blank >= 1; blank--) { //print blank
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (c)\n");

    }

    public static void triangularPatternD(int size) {

        for (int row = 1; row <= size; row++) {
            for (int blank = (size - row); blank >= 1; blank--) { //print blank
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println(" (d)\n");

    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        triangularPatternA(size);
        triangularPatternB(size);
        triangularPatternC(size);
        triangularPatternD(size);

        //scan.close();

    }
}
