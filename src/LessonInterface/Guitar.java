package LessonInterface;

public class Guitar implements Playable {
    private int stringCount;

    public Guitar() {
    }

    public Guitar(int stringCount) {
        this.stringCount = stringCount;
    }

    public int getStringCount() {
        return stringCount;
    }

    public void setStringCount(int stringCount) {
        this.stringCount = stringCount;
    }

    @Override
    public void play() {
        System.out.println("Play guitar  with " + stringCount + " strings " +KEY);
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "stringCount=" + stringCount +
                '}';
    }

}
