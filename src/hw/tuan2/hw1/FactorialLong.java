package hw.tuan2.hw1;

public class FactorialLong {
    public static long isWithinRange(long num, int index) {

        long test;

        try {
            test = Math.multiplyExact(num, index);
        } catch (ArithmeticException e) {
            return -1;
        }

        return test;
    }

    public static void main(String[] args) {

        long factorial = 1;
        int index = 1;

        while (isWithinRange(factorial, index) != -1) {
            factorial = isWithinRange(factorial, index);
            System.out.println("The factorial of " + index + " is " + factorial);
            index = index + 1;
        }
        System.out.println("The factorial of " + index + " is out of range");
    }
}
