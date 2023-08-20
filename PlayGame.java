
public class PlayGame {

    private double[][] environment;
    private Bird bird;
    // later constants for env?

    // Constructor
    public PlayGame() {
        environment = new double[100][100]; 
        bird = new Bird();

    }

    // aim angle in degrees, convert to slope
    // param:
    //      aimAngle 0 <= theta <= 90
    public void fire(Integer aimAngle) {
        // param check
        if (aimAngle > 90 || aimAngle < 0) {
            System.out.println("Please re-enter the angle between 0 and 90 degrees!");
        }

        // convert to first quadrant slope
        double slope = aimAngle / 90.0;

        if (aimAngle < 45)


        
    }






    public void getCords() {
        bird.getCords();
    }


    public static void main(String[] args) {
        PlayGame game = new PlayGame();
    }
}


