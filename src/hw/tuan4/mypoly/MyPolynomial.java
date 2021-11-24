package hw.tuan4.mypoly;

public class MyPolynomial {

    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {

        return coeffs.length - 1;
    }

    public String toString() {

        StringBuilder result = new StringBuilder();

        for (int i = 1; i < coeffs.length; i++) {
            result.append(coeffs[coeffs.length - i]).append("x^").append(coeffs.length - i).append(" + ");
        }
        result.append(coeffs[0]);

        return result.toString();
    }

    public double evaluate(double x) {
        double result = coeffs[0];

        for (int i = 1; i < coeffs.length; i++) {
            result += coeffs[coeffs.length - i] * Math.pow(x, coeffs.length - i);
        }

        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        if (right == null) {
            return this;
        }

        int lengthOfSum = Math.min(this.coeffs.length, right.coeffs.length);

        for (int i = 0; i < lengthOfSum; i++) {
            this.coeffs[i] += right.coeffs[i];
        }

        return this;
    }

    public MyPolynomial multiply(MyPolynomial right) {
        if (right == null) {
            return this;
        }

        int totalLength = this.coeffs.length + right.coeffs.length - 1;
        double[] product = new double[totalLength];

        for (double temp : product) {
            temp = 0;
        }

        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                product[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        this.coeffs = product;

        return this;
    }
}