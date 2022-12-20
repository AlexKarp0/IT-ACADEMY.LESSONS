package OOP.Inheritance;

public class Cheese extends Product{
    int age;

    public Cheese(int age) {
        this.age = age;
    }

    public Cheese(String name, double price, int quantity, int age) {
        super(name, price, quantity);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
