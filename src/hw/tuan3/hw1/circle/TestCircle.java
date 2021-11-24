package hw.tuan3.hw1.circle;

public class TestCircle {

    public void run() {

        Circle circle1 = new Circle();
        System.out.println("The circle has radius of " + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of " + circle2.getRadius() + " and area of " + circle2.getArea());

        // 1.
        Circle circle3 = new Circle(2.0, "blue");
        System.out.println("The circle has radius of " + circle3.getRadius() + " and area of " + circle3.getArea());
        // 2.
        System.out.println("This circle has the color " + circle3.getColor());
        // 3.
        /*System.out.println(circle1.radius);
        circle1.radius = 5.0;*/ // 'radius' has private access, means that they can only be accessed from the class where they are declared, hence the error.
        // 4.
        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());
        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());
        // 5. See Circle.java
        // 6.
        Circle circle5 = new Circle(5.5);
        System.out.println(circle5.toString());
        System.out.println(circle5);
    }
}
