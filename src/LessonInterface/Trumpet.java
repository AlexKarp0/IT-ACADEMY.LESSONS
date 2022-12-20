package LessonInterface;

public class Trumpet implements Playable{
    private int diameter;

    public Trumpet() {
    }

    public Trumpet(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public void play() {
        System.out.println("Play trumpet " + diameter + " diameter " + KEY);
    }
}
