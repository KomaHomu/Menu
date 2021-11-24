package hw.tuan6.resizable;

public class TestCircle {

    public static void main(String[] args) {

        GeometricObject circle = new Circle(2.0);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
    }
}
