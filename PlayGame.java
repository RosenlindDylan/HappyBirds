import java.util.Scanner;

public class PlayGame {

    private double[][] environment;
    private Bird bird;
    Scanner input = new Scanner(System.in);
    // later constants for env?

    // Constructor
    public PlayGame() {
        environment = new double[100][100]; 
        bird = new Bird();

    }

    // aim angle in degrees, convert to slope
    // param:
    //      aimAngle 0 <= theta <= 90
    public void fire(int aimAngle) {
        // param check
        while (aimAngle > 90 || aimAngle < 0) {
            System.out.println("Aim angle must be between 0 and 90 degrees! Please enter a new angle:");
            // parseint might b a dumb way to cast it to an integer
            // prolly catch a non integer exception up here?
            // int angle = Integer.parseInt(input.nextLine());
            
        }

        // convert to first quadrant slope
        double slope = aimAngle / 90.0;

        if (aimAngle < 45) {
            // hits side first so x = 100 and calculate y
            double y = Math.round(slope * 100);
            bird.updateCords(100, y);
        } else {
            // hits top first
            double x = Math.round(slope * 100);
            bird.updateCords(x, 100);
        }        

        System.out.println("The bird hit " + bird.getCords() + "!" );
    }






    public void getCords() {
        bird.getCords();
    }


    public static void main(String[] args) {
        PlayGame game = new PlayGame();
        game.fire(100);
    }
}


