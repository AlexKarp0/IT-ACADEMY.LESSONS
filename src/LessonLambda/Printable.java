package LessonLambda;
@FunctionalInterface
public interface Printable  {
    abstract void print() {
        System.out.println("print from Printabbe");
    }
}
