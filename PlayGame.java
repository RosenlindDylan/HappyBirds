import javax.swing.*;
import java.util.Scanner;

public class PlayGame extends JPanel {

    public static boolean[][] environment;
    private static Bird bird;
    Scanner input = new Scanner(System.in);
    // later constants for env?

    // Constructor
    // MongBeef
    public PlayGame() {
        environment = new boolean[100][100]; 
        bird = new Bird();
    }

    // aim angle in degrees, convert to slope
    // params:
    //      aimAngle 0 <= theta <= 90
    //      0 < power < something else i guess
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

       // convert degrees -> radians
       double angle = Math.toRadians(aimAngle);
       
        // componentize power vector
        double v_0x = power * Math.cos(angle);
        double v_0y = power * Math.sin(angle);

        System.out.println("x initial is: " + v_0x);
        System.out.println("y initial is " + v_0y);

        int time = 1;

        while (path(power, v_0x, v_0y, time)) {
            time++;
        }

        System.out.println("The bird hit " + bird.getCords() + "!" );
    }

    private static boolean path(int power, double v_0x, double v_0y, int time) {

        double tick = time / 100.0;

        // use kinematic equ to update x and y
        double newX = v_0x * tick;
        double newY = v_0y * tick + (1.0 / 2) * -9.81 * Math.pow(tick,2);
        
        // update the bird cords
        bird.updateCords(newX, newY);

        // pixel cordinates
        int x = (int)(Math.round(newX));
        int y = (int)(Math.round(newY));

        if (x >= 100 || y >= 100 || x < 0 || y < 0 || environment[x][y]) {
            System.out.println("the bird hit something!");
            return false;
        }

        System.out.println(newX + " " + newY);
        return true;
    
    }

    public void getCords() {
        bird.getCords();
    }

}


