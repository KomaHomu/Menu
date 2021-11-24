package hw.tuan1.hw2;

public class Factorial {
    public static void main(String[] args) {

        int n = 20;
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i; // at i=17; factorial jumps over integer limit and wraps over
        }

        System.out.println("The factorial of " + n + " is " + factorial);

    }
}
