package hw.tuan4.ballplayer;

public class Field { // incomplete

    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int goalX1;
    private int goalX2;
    private int goalHeight;

    public Field(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        x2 = x1 + width - 1;
        y2 = y1 + height - 1;
    }

    public void setGoal(int goalLength, int goalHeight) {
        goalX1 = Math.abs(x2 - x1) / 2 - goalLength / 2;
        goalX2 = Math.abs(x2 - x1) / 2 + goalLength / 2;

        this.goalHeight = goalHeight;
    }

    public boolean goal(Ball ball) {
        if (ball == null) {
            return false;
        }

        if ((ball.getX() >= goalX1 || ball.getX() <= goalX2) && ball.getY() >= y2 && ball.getZ() <= goalHeight) {
            System.out.println("Goal!");
            return true;
        }

        return false;
    }

    /*public void outOfPlay(Ball ball) { //stubs
        if (ball == null) {
            return;
        }

        if (ball.getX() <= x1 || ball.getX() >= x2) {
            System.out.println("Ball went out of play!");
            System.out.println("Return to starting position!");
            ball.setXYZ(50, 50, 0);
            return;
        }

        if (ball.getY() <= y2 || ball.getY() >= y1) {
            System.out.println("Ball went out of play!");
            System.out.println("Return to starting position!");
            ball.setXYZ(50, 50, 0);
        }
    }

    public void outOfPlay(Player player) {
        if (player == null) {
            return;
        }

        if (player.getX() <= x1 || player.getX() >= x2) {
            System.out.println("Player moved out of field!");
            System.out.println("Return to starting position!");
            player.setPosition(0, 0);
            return;
        }

        if (player.getY() <= y2 || player.getY() >= y1) {
            System.out.println("Player moved out of field!");
            System.out.println("Return to starting position!");
            player.setPosition(0, 0);
        }
    }*/

    public String toString() {

        return "Goal at (" + goalX1 + ", " + y2 + ") - (" + goalX2 + ", " + y2 + ")";
    }
}
