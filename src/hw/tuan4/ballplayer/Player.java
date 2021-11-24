package hw.tuan4.ballplayer;

public class Player {

    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    /*public void setPosition(float xDisp, float yDisp) {
        x = xDisp;
        y = yDisp;
    }*/

    public void jump(float zDisp) {
        z += zDisp;
    }

    public boolean near(Ball ball) {
        if (ball == null) {
            return false;
        }

        return Math.abs(this.x - ball.getX()) < 8 || Math.abs(this.y - ball.getY()) < 8;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void kick(Ball ball, int speed, int direction) {
        if (ball == null) {
            return;
        }

        if (!near(ball)) {
            System.out.println("Go near the ball first!");
            return;
        }

        float xDelta = (float) (speed * Math.cosh(Math.toRadians(direction)));
        float yDelta = (float) (speed * Math.sin(Math.toRadians(direction)));
        float zDelta = (float) (speed * Math.sin(Math.toRadians(direction)));

        ball.setXYZ(xDelta, yDelta, zDelta);
    }

    public String toString() {

        return "Player at (" + x + ", " + y + ")";
    }


}
