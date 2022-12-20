package by.academy.Homework3;

public class Application {
    public static void main(String[] args) {
        System.out.println("app");
        Cheese cheese = new Cheese(1001,0.1,2);
        System.out.println(cheese.toString());
        System.out.println(cheese.calcPrice());
    }
}
