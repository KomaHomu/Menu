package hw.tuan3.hw2.mypoint2;

import hw.tuan3.hw2.mypoint1.MyPoint;

import java.util.Arrays;

public class TestMyLine {

    public void run() {

        MyPoint begin = new MyPoint(8, 6);
        MyPoint end = new MyPoint(4, 5);

        MyLine line1 = new MyLine(begin, end);
        System.out.println(line1);
        System.out.println("begin is: " + line1.getBegin());
        System.out.println("end is: " + line1.getEnd());
        System.out.println("begin is: " + begin);
        System.out.println("end is: " + end);

        line1.setBeginX(1);
        line1.setBeginY(2);
        line1.setEndX(3);
        line1.setEndY(4);
        System.out.println(line1.getBeginX());
        System.out.println(line1.getBeginY());
        System.out.println(line1.getEndX());
        System.out.println(line1.getEndY());

        line1.setBegin(begin);
        line1.setEnd(end);
        System.out.println(Arrays.toString(line1.getBeginXY()));
        System.out.println(Arrays.toString(line1.getEndXY()));

        line1.setBeginXY(3, 0);
        line1.setEndXY(4, 5);
        System.out.println(line1);

        MyLine line2 = new MyLine(8, 6, 10, 14);
        System.out.println(line2);

        System.out.println(line1.getLength());
        System.out.println(line1.getGradient());
    }
}
