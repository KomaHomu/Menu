package hw.tuan4.ballplayer;

import java.util.Scanner;

public class TestPlay { // incomplete

    public void run() {

        Scanner scanner = new Scanner(System.in);

        String choice = "";
        int speed;
        int direction;
        float xDisp;
        float yDisp;

        Ball ball = new Ball(50, 50, 0);
        Player player1 = new Player(1, 0, 0);
        Field fbField = new Field(0, 0, 101, 101);
        fbField.setGoal(20, 10);

        while (!fbField.goal(ball) && !choice.equals("0")) {

            System.out.print("*************************   \nChoose an action: \n1.Move \n2.Kick \n3.Check status \n0. Exit \n************************* \nYour choice: ");
            choice = scanner.next();
            switch (choice) {
                case "1":
                    System.out.print("At x: ");
                    xDisp = scanner.nextInt();
                    System.out.print("At y: ");
                    yDisp = scanner.nextInt();
                    player1.move(xDisp, yDisp);
                    ball.gravity();
                    break;
                case "2" :
                    System.out.print("With speed of: ");
                    speed = scanner.nextInt();
                    System.out.print("And direction of: ");
                    direction = scanner.nextInt();
                    player1.kick(ball, speed, direction);
                    System.out.println(ball);
                    ball.gravity();
                    break;
                case "3" :
                    System.out.println(ball);
                    System.out.println(player1);
                    System.out.println(fbField);
                    break;
                case "0" :
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong command.");
                    break;
            }
        }
    }
}
