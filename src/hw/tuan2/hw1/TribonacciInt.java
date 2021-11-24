package hw.tuan2.hw1;

public class TribonacciInt {
    public static int isWithinRange(int fIndexMinus1, int fIndexMinus2, int fIndexMinus3) {

        int test;

        try {
            test = Math.addExact(fIndexMinus1, fIndexMinus2);
            test = Math.addExact(fIndexMinus3, test);
        } catch (ArithmeticException e) {
            return -1;
        }

        return test;
    }

    public static void main(String[] args) {

        int fIndex;
        int fIndexMinus1 = 2;
        int fIndexMinus2 = 1;
        int fIndexMinus3 = 1;

        int index = 3;

        System.out.println("F(0) = 1");
        System.out.println("F(1) = 1");
        System.out.println("F(2) = 2");

        while (isWithinRange(fIndexMinus1, fIndexMinus2, fIndexMinus3) != -1) {
            fIndex = isWithinRange(fIndexMinus1, fIndexMinus2, fIndexMinus3);
            System.out.println("F(" + index + ") = " + fIndex);

            index++;
            fIndexMinus3 = fIndexMinus2;
            fIndexMinus2 = fIndexMinus1;
            fIndexMinus1 = fIndex;
        }

        System.out.println("F(" + index + ") is out of the range of int");
    }
}
