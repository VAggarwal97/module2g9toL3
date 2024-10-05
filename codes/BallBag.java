import java.util.Scanner;

public class BallBag {

    private final int CAPACITY = 12;
    private int redBalls = 0;
    private int greenBalls = 0;
    private int yellowBalls = 0;

    public void addRedBall() {
        if (redBalls + greenBalls + yellowBalls >= CAPACITY) {
            System.out.println("Bag is full. Cannot add more balls.");
        } else if (redBalls >= greenBalls) {
            System.out.println("Cannot add a red ball. Red balls cannot exceed green balls.");
        } else {
            redBalls++;
            // System.out.println("Added a red ball. Total red balls: " + redBalls);
        }
    }

    public void addGreenBall() {
        if (redBalls + greenBalls + yellowBalls >= CAPACITY) {
            System.out.println("Bag is full. Cannot add more balls.");
        } else {
            greenBalls++;
            // System.out.println("Added a green ball. Total green balls: " + greenBalls);
        }
    }

    public void addYellowBall() {
        if (redBalls + greenBalls + yellowBalls >= CAPACITY) {
            System.out.println("Bag is full. Cannot add more balls.");
        } else if (yellowBalls >= (int) (CAPACITY * 0.4)) {
            System.out.println("Cannot add more yellow balls. Yellow balls cannot exceed 40% of the total.");
        } else {
            yellowBalls++;
            // System.out.println("Added a yellow ball. Total yellow balls: " + yellowBalls);
        }
    }

    public void showBagContents() {
        System.out.println("Bag contents: " + redBalls + " red, " + greenBalls + "green, " + yellowBalls + " yellow.");
    }

    public int totalBalls() {
        return redBalls + greenBalls + yellowBalls;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BallBag bag = new BallBag();

        while (true) {
            System.out.print(
                    " enter 1 for green balls :, enter 2 for red balls , enter 3 for yellow balls , enter 0 to exit : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of green balls to add: ");
                    int greenToAdd = sc.nextInt();
                    for (int i = 0; i < greenToAdd; i++) {
                        bag.addGreenBall(); 
                    }
                    // System.out.println("total number of balls after adding: " + bag.totalBalls());
                    break;

                case 2:
                    System.out.print("Enter the number of red balls to add:");
                    int redToAdd = sc.nextInt();
                    for (int i = 0; i < redToAdd; i++) {
                        bag.addRedBall();
                    }
                    System.out.println("total number of balls after adding: " + bag.totalBalls());
                    // System.out.println("Total red balls: " + bag.redBalls);
                    break;

                case 3:
                    System.out.print("Enter the number of yellow balls to add: ");
                    int yellowToAdd = sc.nextInt();
                   
                    for (int i = 0; i < yellowToAdd; i++) {
                        bag.addYellowBall();
                    }
                    System.out.println("total number of balls after adding: " + bag.totalBalls());
                    break;

                case 0:
                    System.out.println("exiting this code");
                    bag.showBagContents();
                    sc.close();
                    return;

                default:
                    System.out.println("invalid choice... enter 1,2,3...0");
            }

        }

        // BallBag bag = new BallBag();
        // bag.addGreenBall();
        // bag.addRedBall();
        // bag.addRedBall();
        // bag.addGreenBall();
        // bag.addYellowBall();
        // bag.addYellowBall();
        // bag.addYellowBall();
        // bag.addRedBall();
        // bag.showBagContents();
    }
}
