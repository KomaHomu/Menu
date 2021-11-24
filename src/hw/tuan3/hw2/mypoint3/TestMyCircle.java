package hw.tuan3.hw2.mypoint3;

import hw.tuan3.hw2.mypoint1.MyPoint;

import java.util.Arrays;

public class TestMyCircle {

    public static void main(String[] args) {

        MyPoint center = new MyPoint(1, 2);
        MyPoint newCenter = new MyPoint(3, 4);

        MyCircle circle1 = new MyCircle(center, 4);
        System.out.println(circle1);
        System.out.println("center is: " + circle1.getCenter());
        System.out.println("center's x is: " + circle1.getCenterX());
        System.out.println("center's y is: " + circle1.getCenterY());
        System.out.println("center's xy is: " + Arrays.toString(circle1.getCenterXY()));

        circle1.setCenter(newCenter);
        circle1.setRadius(5);
        System.out.println(circle1);

        circle1.setCenterX(5);
        circle1.setCenterY(6);
        System.out.println(circle1);

        circle1.setCenterXY(1, 1);
        System.out.println(circle1);

        MyCircle circle2 = new MyCircle();
        System.out.println(circle2);
        MyCircle circle3 = new MyCircle(0, 2, 5);
        System.out.println(circle3);

        System.out.println(circle1.getArea());
        System.out.println(circle1.getCircumference());

        System.out.println(circle1.distance(circle2));
    }
}
