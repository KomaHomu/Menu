package hw.tuan2.hw1;

public class SpecialSeries {
    public static double specialSeries(double x, int numTerms) {

        double result = x;
        double variable = x;
        double fraction = 1;
        double temp = 1;

        double num = 1;

        for (int term = 1; term <= numTerms; term++) {
            fraction *= (num) / ((num + 1) * (num + 2));
            variable *= x * x;
            temp *= fraction * variable;
            result += temp;
            num += 2;
        }

        return result;
    }

    public static void main(String[] args) {

        double x = 0.5;
        int term = 3;

        System.out.println("Special series for x: " + specialSeries(x, term));
    }
}
