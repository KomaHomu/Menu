package hw.tuan3.hw1.circle;

public class TestMain {

    public static void main(String[] args) {

        CircleToo circle1 = new CircleToo(1.1);
        System.out.println(circle1);
        CircleToo circle2 = new CircleToo();
        System.out.println(circle2);

        circle1.setRadius(2.2);
        System.out.println(circle1);
        System.out.println("radius is: " + circle1.getRadius());

        System.out.printf("area is: %.2f%n", circle1.getArea());
        System.out.printf("circumference is: %.2f%n", circle1.getCircumference());
    }
}
