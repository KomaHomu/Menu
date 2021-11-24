package hw.tuan4.mypoly;

public class TestMyPolynomial {

    public void run() {

        MyPolynomial polynomial1 = new MyPolynomial(1.0, 2.0, 3.0, 4.0);
        MyPolynomial polynomial2 = new MyPolynomial(1.0, 3.0, 5.0);

        System.out.println(polynomial1);
        System.out.println(polynomial2);
        System.out.println("Degree: " + polynomial1.getDegree());
        System.out.println("Evaluate: " + polynomial1.evaluate(2.0));
        System.out.println("Added with poly 2: " + polynomial1.add(polynomial2));
        System.out.println("Multiplied with poly 2: " + polynomial1.multiply(polynomial2));
    }
}
