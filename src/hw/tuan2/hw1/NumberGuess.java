package hw.tuan2.hw1;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

    public static void guessingGame() {

        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        final int SECRET_NUMBER = rd.nextInt(0, 100);
        int guess;
        int count = 1;

        System.out.print("Guess a number between 0 - 100: ");
        guess = scan.nextInt();

        while (guess != SECRET_NUMBER) {

            //System.out.println(SECRET_NUMBER);

            if (guess < SECRET_NUMBER) {
                System.out.print("Try higher, re-enter: ");
            } else {
                System.out.print("Try lower, re-enter: ");
            }

            guess = scan.nextInt();
            count++;
        }

        if (count == 1) {
            System.out.println("You got it in 1 trial!");
        } else {
            System.out.println("You got it in " + count + " trials!");
        }
    }

    public static void main(String[] args) {

        guessingGame();
    }
}
