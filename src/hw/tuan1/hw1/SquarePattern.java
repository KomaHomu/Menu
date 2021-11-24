package hw.tuan1.hw1;

import java.util.Scanner;

public class SquarePattern {
    public static void printWithForLoop(int size) {
        for (int row = 1; row <= size; row++) {
            for (int col = 1; col <= size; col++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void printWithWhileDo(int size) {
        int row = size;
        int col = size;

        while (row >= 1) {
            while (col >= 1) {
                System.out.print("#");
                col--;
            }
            System.out.println();
            col = size; //reset row
            row--;
        }
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size: ");
        int size = scan.nextInt();

        printWithForLoop(size);
        printWithWhileDo(size);

        //scan.close();

    }
}
