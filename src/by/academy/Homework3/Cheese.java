package by.academy.Homework3;

public class Cheese extends  Product{
    private int age;

    public Cheese(int age) {
        this.age = age;
    }

    public Cheese(double quantity, double price, int age) {
        super(quantity, price);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    protected double discount() {
        return this.getFullPrice() > 100 ? 0.8 : 1;
    }
}
