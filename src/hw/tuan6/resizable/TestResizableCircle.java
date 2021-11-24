package hw.tuan6.resizable;

public class TestResizableCircle {

    public void run() {

        Circle circle = new ResizableCircle(4.0);

        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        ResizableCircle resizableCircle = (ResizableCircle) circle;
        resizableCircle.resize(50);
        System.out.println(resizableCircle);
    }
}
