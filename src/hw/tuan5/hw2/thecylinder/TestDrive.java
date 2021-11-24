package hw.tuan5.hw2.thecylinder;

public class TestDrive {

    public void run() {

        Circle circle = new Circle();
        System.out.println(circle);

        circle.setRadius(2.0);
        circle.setColor("blue");
        System.out.println(circle.getRadius());
        System.out.println(circle.getColor());
        System.out.println(circle.getArea());

        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);
        Cylinder cylinder2 = new Cylinder(2.0);
        System.out.println(cylinder2);
        Cylinder cylinder = new Cylinder(circle, 4.0);
        System.out.println(cylinder);
        System.out.println(cylinder.getArea());
        System.out.println(cylinder.getVolume());
    }
}
