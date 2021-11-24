package hw.tuan2.hw1;

public class FactorialInt {
    public static int isWithinRange(int num, int index) {

        int test;

        try {
            test = Math.multiplyExact(num, index);
        } catch (ArithmeticException e) {
            return -1;
        }

        return test;
    }

    public static void main(String[] args) {

        int factorial = 1;
        int index = 1;

        while (isWithinRange(factorial, index) != -1) {
            factorial = isWithinRange(factorial, index);
            System.out.println("The factorial of " + index + " is " + factorial);
            index++;
        }
        System.out.println("The factorial of " + index + " is out of range");
    }
}
