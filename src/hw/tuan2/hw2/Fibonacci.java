package hw.tuan2.hw2;

public class Fibonacci {
    public static int fibonacci(int num) {

        if (num == 0) {
            return 0;
        }

        if (num == 1) {
            return 1;
        }

        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    public void run() {

        int num = 10;

        int fib = fibonacci(num);

        System.out.println("Fibonacci (" + num + ") = " + fib);
    }
}
