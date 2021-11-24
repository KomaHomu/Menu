package hw.tuan4.bouncingball;

public class Ball {

    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        xDelta = (float) (speed * Math.cosh(Math.toRadians(direction)));
        yDelta = (float) (speed * Math.sin(Math.toRadians(direction)));
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move() {
        setX(getX() + getxDelta());
        setY(getY() + getyDelta());
    }

    public void reflectHorizontal() {
        setxDelta(-getxDelta());
    }

    public void reflectVertical() {
        setyDelta(-getyDelta());
    }

    public String toString() {
        return "Ball at (" + getX() + ", " + getY() + ") of velocity (" + getxDelta() + ", " + getyDelta() + ")";
    }
}
