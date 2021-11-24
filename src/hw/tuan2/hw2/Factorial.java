package hw.tuan2.hw2;

public class Factorial {

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        int num = 5;

        int factorial = factorial(num);

        System.out.println("Factorial (" + num + ") = " + factorial);
    }
}
