package by.academy.Homework3;

public class Champagne extends Wine {
    int co2;

    public Champagne(String color, int co2) {
        super(color);
        this.co2 = co2;
    }

    public Champagne(double quantity, double price, String name, String color, int co2) {
        super(quantity, price, name, color);
        this.co2 = co2;
    }

    public Champagne(double quantity, double price, String color, int co2) {
        super(quantity, price, color);
        this.co2 = co2;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

}
