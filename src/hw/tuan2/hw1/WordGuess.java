package hw.tuan2.hw1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordGuess {

    private static final Random rand = new Random();
    private static List<String> lines = null;

    static {
        try {
            lines = Files.readAllLines(new File("input/random.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getSecretWord() {

        String selLine = lines.get(rand.nextInt(lines.size()));
        String[] arrOfLine = selLine.split(" ");

        return arrOfLine[rand.nextInt(arrOfLine.length)].toLowerCase();
    }

    public static boolean isWord(String guess, String word) {

        return guess.equals(word);
    }

    public static boolean hasChar(String guess, String word, StringBuilder temp) {

        char test;
        int charCount = 0;

        test = guess.charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (test == word.charAt(i)) {

                temp.setCharAt(i, test);
                charCount++;
            }
        }

        return charCount != 0;
    }

    public static void guessingGame() {

        Scanner scan = new Scanner(System.in);

        final String SECRET_WORD = getSecretWord(); // set as args[0] if you want to get the word using command-line

        String guess;
        int turn = 0;
        StringBuilder temp;
        char[] arr = new char[SECRET_WORD.length()];

        Arrays.fill(arr, '-');
        temp = new StringBuilder(new String(arr));

        //System.out.println("The secret word is: " + SECRET_WORD); //testing-only

        System.out.print("() Key in one character or your guess word: ");
        guess = scan.next().toLowerCase();

        while (true) {
            if (guess.length() == SECRET_WORD.length()) {
                if (isWord(guess, SECRET_WORD)) {
                    turn++;
                    break;
                } else {
                    System.out.println("Incorrect word.");
                    turn++;
                }
            }

            if (guess.length() == 1) {
                if (!hasChar(guess, SECRET_WORD, temp)) {
                    System.out.println("Word does not contains character " + guess + ".");
                }

                if (isWord(temp.toString(), SECRET_WORD)) {
                    turn++;
                    break;
                }

                turn++;
                System.out.println("Trial " + turn + ": " + temp);
            }

            if (guess.length() < SECRET_WORD.length() && guess.length() > 1) {
                System.out.println("Incorrect input length.");
            }

            System.out.print("() Key in one character or your guess word: ");
            guess = scan.next().toLowerCase();
        }

        System.out.println("Congratulation!");
        if (turn == 1) {
            System.out.println("You got it in 1 trial!");
        } else {
            System.out.println("You got it in " + turn + " trials!");
        }
    }

    public static void main(String[] args) {

        guessingGame();
    }
}
