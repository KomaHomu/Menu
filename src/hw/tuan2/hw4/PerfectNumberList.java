package hw.tuan2.hw4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumberList {

    public static int sumOfDivisor(int number) {

        int sum = 1;

        for (int i = 2; i <= number / 2; i++) {

            if (number % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPerfect(int aPosInt) {

        if (aPosInt <= 1) {
            return false;
        }

        return aPosInt == sumOfDivisor(aPosInt);
    }

    public static boolean isDeficient(int aPosInt) {

        if (aPosInt <= 1) {
            return false;
        }

        return aPosInt > sumOfDivisor(aPosInt);
    }

    public static void printArr(List<Integer> arr) {

        for (Integer num : arr) {

            System.out.print(num + " ");
        }
    }

    public static void printResult(List<Integer> arr, int bound, String str) {

        double counter = arr.size();

        double percent = counter / bound * 100.00;

        System.out.printf("These numbers are %s: %n", str);
        printArr(arr);
        if (arr.isEmpty()) {
            System.out.println("[No number found]");
        } else if (arr.size() == 1) {
            System.out.printf("%n[1 number found (%.2f%%)]%n", percent);
        } else {
            System.out.printf("%n[%d numbers found (%.2f%%)]%n", arr.size(), percent);
        }
    }

    public static void calculate(int upBound) {

        ArrayList<Integer> perfArr = new ArrayList<>();
        ArrayList<Integer> defArr = new ArrayList<>();
        ArrayList<Integer> noneArr = new ArrayList<>();

        for (int i = 6; i <= upBound; i++) {

            if (isPerfect(i)) {
                perfArr.add(i);
            }
        }

        printResult(perfArr, upBound, "perfect"); //print all perfect

        for (int i = 2; i <= upBound; i++) {

            if (isDeficient(i)) {
                defArr.add(i);
            }
        }

        perfArr.addAll(defArr); //no need to remove duplicates as there is none

        checker:
        for (int i = 2; i <= upBound; i++) {
            for (Integer check : perfArr) {

                if (i == check) {
                    continue checker;
                }
            }

            noneArr.add(i);
        }

        printResult(noneArr, upBound, "neither deficient nor perfect"); //print all none-perfect and none-deficient
    }

    public void run() {

        Scanner scan = new Scanner(System.in);

        int upBound;

        System.out.print("Enter the upper bound: ");
        upBound = scan.nextInt();

        calculate(upBound);
    }
}
