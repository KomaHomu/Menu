package hw.tuan4.bouncingball;

public class Container {

    private final int x1;
    private final int y1;
    private final int x2;
    private final int y2;

    public Container(int x, int y, int width, int height) {
        x1 = x;
        y1 = y;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return Math.abs(x2 - x1);
    }

    public int getHeight() {
        return Math.abs(y2 - y1);
    }

    public boolean collides(Ball ball) {
        if ((ball.getX() + ball.getRadius() <= this.x1) || (ball.getX() + ball.getRadius() >= this.x2)) {
            ball.reflectHorizontal();
            return true;
        }

        if ((ball.getY() + ball.getRadius() <= this.y2) || (ball.getY() + ball.getRadius() >= this.y1)) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }
}
