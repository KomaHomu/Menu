package hw.tuan3.hw2.mypoint1;

public class MyPoint {

    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] xy = new int[2];

        xy[0] = getX();
        xy[1] = getY();

        return xy;
    }

    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance(int x, int y) {
        int xDelta = this.x - x;
        int yDelta = this.y - y;

        return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public double distance(MyPoint another) {
        int xDelta = this.x - another.getX();
        int yDelta = this.y - another.getY();

        return Math.sqrt(xDelta * xDelta + yDelta * yDelta);
    }

    public double distance() {
        return Math.sqrt(getX() * getX() + getY() * getY());
    }

    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
}
