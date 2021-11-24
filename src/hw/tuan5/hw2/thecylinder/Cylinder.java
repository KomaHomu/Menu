package hw.tuan5.hw2.thecylinder;

public class Cylinder { // still the better one

    private Circle base;
    private double height;

    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    public Cylinder(Circle base, double height) {
        this.base = base;
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return base.getArea() * 2 + base.getRadius() * getHeight() * 2 * Math.PI;
    }

    public double getVolume() {
        return base.getArea() * getHeight();
    }

    public String toString() {
        return "Cylinder: subclass of " + base + " height = " + getHeight();
    }
}
