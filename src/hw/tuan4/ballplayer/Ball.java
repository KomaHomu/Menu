package hw.tuan4.ballplayer;

public class Ball {

    private float x;
    private float y;
    private float z;

    public Ball(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x += x;
        this.y += y;
        this.z += z;
    }

    public void gravity() {
        if (getZ() == 0) {
            return;
        }

        z -= z * 0.5;
    }

    public String toString() {

        return "Ball at (" + getX() + ", " + getY() + ", " + getZ() + ")";
    }
}
