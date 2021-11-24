package hw.tuan3.hw2.mypoint4;

import hw.tuan3.hw2.mypoint1.MyPoint;

public class TestMain {

    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(1, 2);
        MyPoint point2 = new MyPoint(5, 3);
        MyPoint point3 = new MyPoint(4, 2);
        MyTriangle triangle1 = new MyTriangle(point1, point2, point3);
        MyTriangle triangle2 = new MyTriangle(1, 0, 0, 1, 1, 1);
        System.out.println(triangle1);
        System.out.println(triangle1.getPerimeter());
        System.out.println(triangle1.printType());
        System.out.println(triangle2.printType());
    }

}
