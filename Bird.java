import java.util.ArrayList;

public class Bird {

    private double x;
    private double y;

    // Creates a Happy Bird with default coordinates (0.0, 0.0)
    public Bird() {
        x = 0.0;
        y = 0.0;
    }

    // returns a string describing where bird is currently located in
    // the format (x, y) rounded to 2 decimal places each
    public String getCords() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    // updates the bird cords
    public void updateCords(double x, double y) {
        this.x = x;
        this.y = y;
    }
}