package hw.tuan6.geometricobject;

public class TestDrive {

    public void run() {

        GeometricObject circle = new Circle(2.0);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        GeometricObject rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}
