package hw.tuan6.movablesquare;

public class TestSquare {

    public static void main(String[] args) {

        MovableRectangle movableRectangle = new MovableRectangle(1, 1, 2, 2, 4, 4);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
    }
}
