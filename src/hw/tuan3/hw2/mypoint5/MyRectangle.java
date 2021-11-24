package hw.tuan3.hw2.mypoint5;

import hw.tuan3.hw2.mypoint1.MyPoint;

public class MyRectangle {

    private MyPoint topLeft;
    private MyPoint botRight;

    public MyRectangle(MyPoint topLeft, MyPoint botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.botRight = new MyPoint(x2, y2);
    }

    public MyPoint getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    public MyPoint getBotRight() {
        return botRight;
    }

    public void setBotRight(MyPoint botRight) {
        this.botRight = botRight;
    }

    public int getTopLeftX() {
        return topLeft.getX();
    }

    public void setTopLeftX(int x) {
        topLeft.setX(x);
    }

    public int getTopLeftY() {
        return topLeft.getY();
    }

    public void setTopLeftY(int y) {
        topLeft.setY(y);
    }

    public int getBotRightX() {
        return botRight.getX();
    }

    public void setBotRightX(int x) {
        botRight.setX(x);
    }

    public int getBotRightY() {
        return botRight.getY();
    }

    public void setBotRightY(int y) {
        botRight.setY(y);
    }

    public int[] getTopLeftXY() {
        return topLeft.getXY();
    }

    public void setTopLeftXY(int x, int y) {
        topLeft.setXY(x, y);
    }

    public int[] getBotRightXY() {
        return botRight.getXY();
    }

    public void setBotRightXY(int x, int y) {
        botRight.setXY(x, y);
    }

    public int getArea() {
        int width = getBotRightX() - getTopLeftX();
        int height = getTopLeftY() - getBotRightY();

        return width * height;
    }

    public int getPerimeter() {
        int width = getBotRightX() - getTopLeftX();
        int height = getTopLeftY() - getBotRightY();

        return 2 * (width + height);
    }

    public String toString() {
        return "MyRectangle[topLeft = " + getTopLeft() + ", botRight = " + getBotRight();
    }
}
