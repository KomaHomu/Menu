package hw.tuan2.hw2;

public class GCD {

    public static int gcd(int a, int b) {

        return (b == 0) ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {

        int first = 120;
        int sec = 245;
        int gcd;

        gcd = gcd(first, sec);

        System.out.println("The greatest common divisor between " + first
                + " and " + sec + " is: " + gcd);
    }
}
