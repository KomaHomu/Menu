package hw.tuan2.hw1;

public class TrigonometricSeries {

    public static double sin(double x, int numTerms) {

        double result = 1;
        double temp = 1;
        int factorial = 2;

        x = Math.toRadians(x);

        for (int term = 1; term <= numTerms; term++) {
            temp *= (-x * x) / ((factorial++) * (factorial++));
            result += temp;
        }

        return result * x;
    }

    public static double cos(double x, int numTerms) {

        double result = 1;
        double temp = 1;
        int factorial = 1;

        x = Math.toRadians(x);

        for (int term = 1; term <= numTerms; term++) {
            temp *= (-x * x) / ((factorial++) * (factorial++));
            result += temp;
        }

        return result;
    }

    public void run() {

        double x = 30;
        int term = 5;

        System.out.println("The sine for x = " + x + " is: " + sin(x, term));
        System.out.println("The cosine for x = " + x + " is: " + cos(x, term));
    }
}
