import java.util.ArrayList;

public class Bird {
    private ArrayList<Double> bird;
    public Bird() {
        bird = new ArrayList<>(); 
        bird.add(0.0);
        bird.add(0.0);
    }

    public void getCords() {
        System.out.println("The bird is at " + bird.get(0) + "," + bird.get(1));
    }

    // update the bird cords
    public void updateCords(double x, double y) {
        bird.set(0,x);
        bird.set(1,y);
    }
}