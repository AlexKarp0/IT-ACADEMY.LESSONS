package LessonInterface;

public class Drumm implements Playable{
    private int size;

    public Drumm() {
    }

    public Drumm(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void play() {
        System.out.println("Play drums size of " + size + " " + KEY);
    }
}
