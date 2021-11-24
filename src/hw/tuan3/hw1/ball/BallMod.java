package hw.tuan3.hw1.ball;

public class BallMod {

    private float x;
    private float y;
    private int radius;
    private int speed;
    private int directionInDegree;

    public BallMod(float x, float y, int radius, int speed, int directionInDegree) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.speed = speed;
        this.directionInDegree = directionInDegree;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirectionInDegree() {
        return directionInDegree;
    }

    public void setDirectionInDegree(int directionInDegree) {
        this.directionInDegree = directionInDegree;
    }

    public void move() {

        setX(getX() + (float) (getSpeed() * Math.cosh(Math.toRadians(getDirectionInDegree()))));
        setY(getY() + (float) (getSpeed() * Math.sin(Math.toRadians(getDirectionInDegree()))));
    }

    public void reflect() {
        setSpeed(-getSpeed());
    }

    public String toString() {
        return "BallMod[(" + getX() + ", " + getY() + "), speed=(" + getSpeed() + ", " + getDirectionInDegree() + ")]";
    }
}
