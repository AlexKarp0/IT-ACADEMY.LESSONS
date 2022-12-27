package LessonInterface;

public class Magazine  implements Printable{
    private String creator;

    public Magazine() {
    }

    public Magazine(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public void print() {
        System.out.println("MAGAZINE" + creator);
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "creator='" + creator + '\'' +
                '}';
    }
    public static void printMagazines(Printable[] printables){
        for (Printable printable : printables) {
            if (printable instanceof Magazine){
                System.out.println(printable);
            }

        }

    }
}
