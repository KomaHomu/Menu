package hw.tuan5.hw2.theline;

public class TestLineSub {

    public static void main(String[] args) {

        Point p1 = new Point(1, 2);
        Point p2 = new Point(5, 6);

        LineSub lineSub1 = new LineSub(p1, p2);
        System.out.println(lineSub1);

        lineSub1.setBeginXY(3, 4);
        System.out.println(lineSub1);
    }
}
