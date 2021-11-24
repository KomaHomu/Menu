package hw.tuan2.hw1;

public class FibonacciInt {
    public static int isWithinRange(int fIndexMinus1, int fIndexMinus2) {

        int test;

        try {
            test = Math.addExact(fIndexMinus1, fIndexMinus2);
        } catch (ArithmeticException e) {
            return -1;
        }

        return test;
    }

    public void run() {

        int fIndex;
        int fIndexMinus1 = 1;
        int fIndexMinus2 = 1;

        int index = 2;

        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");

        while (isWithinRange(fIndexMinus1, fIndexMinus2) != -1) {
            fIndex = isWithinRange(fIndexMinus1, fIndexMinus2);
            System.out.println("F(" + index + ") = " + fIndex);

            index++;
            fIndexMinus2 = fIndexMinus1;
            fIndexMinus1 = fIndex;
        }

        System.out.println("F(" + index + ") is out of the range of int");
    }
}
