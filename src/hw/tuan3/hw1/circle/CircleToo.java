package hw.tuan3.hw1.circle;

public class CircleToo {

    private double radius;

    public CircleToo() {
        radius = 1.0;
    }

    public CircleToo(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
