package hw.tuan6.movablepoint;

public class TestDrive {

    public void run() {

        MovablePoint point = new MovablePoint(0, 0, 5, 5);
        System.out.println(point);
        point.moveUp();
        point.moveLeft();
        System.out.println("New position:" + point);

        point.moveDown();
        point.moveRight();
        System.out.println("New position:" + point);

        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 5);
        System.out.println(circle);
        circle.moveUp();
        circle.moveLeft();
        System.out.println("New position:" + circle);

        circle.moveDown();
        circle.moveRight();
        System.out.println("New position:" + circle);
    }
}
