package hw.tuan4.mycomplex;

public class TestDrive {

    public static void main(String[] args) {

        MyComplex complex1 = new MyComplex(1.1, 2.2);
        MyComplex complex2 = new MyComplex();
        MyComplex complex3 = new MyComplex(0.0, 3.3);

        System.out.println(complex1);
        System.out.println(complex2);
        System.out.println("real: " + complex1.getReal());
        System.out.println("imagine: " + complex1.getImag());

        complex1.setValue(1.2, 3.4);
        System.out.println(complex1);
        complex1.setReal(1.1);
        complex1.setImag(2.2);
        System.out.println(complex1);

        System.out.println(complex1.equals(1.1, 2.2));
        System.out.println(complex1.equals(complex2));

        System.out.println("complex 3 is real: " + complex3.isReal());
        System.out.println("complex 1 is imaginary: " + complex1.isImaginary());

        System.out.println("complex1's mag: " + complex1.magnitude());
        System.out.println("complex1's arg: " + complex1.argument());

        System.out.println(complex1.addNew(complex3));
        System.out.println(complex1.subtractNew(complex3));
        System.out.println(complex1.add(complex3));
        System.out.println(complex1.subtract(complex3));

        System.out.println(complex1.multiply(complex3));
        System.out.println(complex1.divide(complex3));

        System.out.println(complex1.conjugate());
    }
}
