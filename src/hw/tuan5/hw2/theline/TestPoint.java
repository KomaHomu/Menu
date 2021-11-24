package hw.tuan5.hw2.theline;

public class TestPoint {

    public void run() {

        Point p1 = new Point(10, 20);
        System.out.println(p1);

        p1.setXY(100, 10);
        System.out.println(p1);

        p1.setX(10);
        p1.setY(20);
        System.out.println("x: " + p1.getX());
        System.out.println("y: " + p1.getY());
    }
}
