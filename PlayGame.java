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
    public void fire(int aimAngle, int power) {
        // param check
        while (aimAngle > 90 || aimAngle < 0) {
            System.out.println("Aim angle must be between 0 and 90 degrees! Please enter a new angle:");
            // parseint might b a dumb way to cast it to an integer
            // prolly catch a non integer exception up here?
            aimAngle = Integer.parseInt(input.nextLine());
            // regex check instead for AN
       }
       
       // while something, update tick time and call path
       
        // componentize power vector
        double v_0x = power * Math.sin(aimAngle);
        double v_0y = power * Math.cos(aimAngle);
       
        path(aimAngle, power, v_0x, v_0y);

        System.out.println("The bird hit " + bird.getCords() + "!" );
    }

    private static void path(int aimAngle, int power, double v_0x, double v_0y) {
        
        // placeholder time variable
        int time = 1;

        // use kinematic equ to update x and y
        double newX = v_0x * time;
        double newY = v_0y * time + (1.0 / 2) * -9.81 * Math.pow(time,2);



    
    }





    public void getCords() {
        bird.getCords();
    }


    public static void main(String[] args) {
        PlayGame game = new PlayGame();
        game.fire(100, 100);
    }
}


