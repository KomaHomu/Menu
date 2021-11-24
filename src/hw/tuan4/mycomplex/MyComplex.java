package hw.tuan4.mycomplex;

public class MyComplex {

    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        setReal(real);
        setImag(imag);
    }

    public String toString() {

        return "(" + getReal() + " + " + getImag() + "i)";
    }

    public boolean isReal() {

        return getImag() == 0.0;
    }

    public boolean isImaginary() {

        return getReal() == 0.0;
    }

    public boolean equals(double real, double imag) {

        return (Double.compare(this.real, real) == 0) && (Double.compare(this.imag, imag) == 0);
    }

    public boolean equals(MyComplex another) {
        if (another == null) {
            return false;
        }

        return (Double.compare(this.real, another.getReal()) == 0) && (Double.compare(this.imag, another.getImag()) == 0);
    }

    public double magnitude() {

        return Math.sqrt(getReal() * getReal() + getImag() * getImag());
    }

    public double argument() {

        return Math.atan2(getImag(), getReal());
    }

    public MyComplex add(MyComplex right) {
        if (right == null) {
            return this;
        }

        setValue(this.real + right.getReal(), this.imag + right.getImag());

        return this;
    }

    public MyComplex addNew(MyComplex right) {
        if (right == null) {
            return this;
        }

        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        if (right == null) {
            return this;
        }

        setValue(this.real - right.getReal(), this.imag - right.getImag());

        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        if (right == null) {
            return this;
        }

        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) {
        if (right == null) {
            return this;
        }

        setReal(this.real * right.getReal() - this.imag * right.getImag());
        setImag(this.real * right.getImag() + this.imag * right.getReal());

        return this;
    }

    public MyComplex divide(MyComplex right) {
        if (right == null) {
            return this;
        }

        double rightMag = right.magnitude();

        setReal((this.real * right.getReal() - this.imag * -right.getImag()) / rightMag);
        setImag((this.real * -right.getImag() + this.imag * right.getReal()) / rightMag);

        return this;
    }

    public MyComplex conjugate() {
        setImag(-getImag());

        return this;
    }
}
