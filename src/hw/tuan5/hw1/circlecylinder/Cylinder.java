package hw.tuan5.hw1.circlecylinder;

public class Cylinder extends Circle {

    private double height;

    public Cylinder() {
        super();
        height = 1.0;
    }

    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + getRadius() * getHeight() * 2 * Math.PI;
    }

    /*public double getVolume() {
        return getArea() * getHeight();
    }*/

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder: subclass of " + super.toString() + " height = " + getHeight();
    }
}
