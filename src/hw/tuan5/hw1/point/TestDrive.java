package hw.tuan5.hw1.point;

import java.util.Arrays;

public class TestDrive {

    public static void main(String[] args) {

        Point2D point2D1 = new Point2D();
        System.out.println(point2D1);
        point2D1.setX(2.0f);
        point2D1.setY(3.0f);
        System.out.println(point2D1.getX());
        System.out.println(point2D1.getY());
        point2D1.setXY(1.0f, 2.0f);
        System.out.println(Arrays.toString(point2D1.getXY()));

        Point2D point3D = new Point3D(1.0f, 1.0f, 1.0f);
        System.out.println(point3D);
        Point3D point3D1 = new Point3D();
        System.out.println(point3D1);
        point3D1.setXY(2.0f, 3.0f, 4.0f);
        System.out.println(Arrays.toString(point3D1.getXYZ()));
    }
}
