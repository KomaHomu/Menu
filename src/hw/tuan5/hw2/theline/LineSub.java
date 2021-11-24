package hw.tuan5.hw2.theline;

public class LineSub extends Point {

    private Point end;

    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Point getBegin() {
        return new Point(getX(), getY());
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX();
    }

    public void setBeginX(int x) {
        setX(x);
    }

    public int getBeginY() {
        return getY();
    }

    public void setBeginY(int y) {
        setY(y);
    }

    public int getEndX() {
        return getX();
    }

    public void setEndX(int x) {
        setX(x);
    }

    public int getEndY() {
        return getY();
    }

    public void setEndY(int y) {
        setY(y);
    }

    public int[] getBeginXY() {
        return new int[]{getBeginX(), getBeginY()};
    }

    public void setBeginXY(int x, int y) {
        setXY(x, y);
    }

    public int[] getEndXY() {
        return new int[]{getEndX(), getEndY()};
    }

    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    public double getLength() {
        return Math.sqrt(Math.pow(getBeginY() - getEndY(), 2) + Math.pow(getBeginX() - getEndX(), 2));
    }

    public double getGradient() {
        return Math.atan2(getBeginY() - getEndY(), getBeginX() - getEndX());
    }

    @Override
    public String toString() {
        return "LineSub[begin = " + getBegin() + ", end = " + getEnd() + "]";
    }
}
