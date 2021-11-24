package hw.tuan3.hw2.mypoint5;

import hw.tuan3.hw2.mypoint1.MyPoint;

import java.util.Arrays;

public class TestMyRectangle {

    public static void main(String[] args) {

        MyPoint topLeft = new MyPoint(8, 6);
        MyPoint botRight = new MyPoint(4, 5);

        MyRectangle rectangle1 = new MyRectangle(topLeft, botRight);
        System.out.println(rectangle1);
        System.out.println("topLeft is: " + rectangle1.getTopLeft());
        System.out.println("botRight is: " + rectangle1.getBotRight());
        System.out.println("topLeft is: " + topLeft);
        System.out.println("botRight is: " + botRight);

        rectangle1.setTopLeftX(1);
        rectangle1.setTopLeftY(2);
        rectangle1.setBotRightX(3);
        rectangle1.setBotRightY(4);
        System.out.println(rectangle1.getTopLeftX());
        System.out.println(rectangle1.getTopLeftY());
        System.out.println(rectangle1.getBotRightX());
        System.out.println(rectangle1.getBotRightY());

        rectangle1.setTopLeft(topLeft);
        rectangle1.setBotRight(botRight);
        System.out.println(Arrays.toString(rectangle1.getTopLeftXY()));
        System.out.println(Arrays.toString(rectangle1.getBotRightXY()));

        rectangle1.setTopLeftXY(1, 3);
        rectangle1.setBotRightXY(4, 2);
        System.out.println(rectangle1);

        MyRectangle rectangle2 = new MyRectangle(8, 6, 10, 14);
        System.out.println(rectangle2);

        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
    }
}
