package by.academy.Homework3;



public class Wine extends Product {
     protected String color;


    public Wine(String color) {
        this.color = color;
    }

    public Wine(double quantity, double price, String name, String color) {
        super(quantity, price, name);
        this.color = color;
    }

    public Wine(double quantity, double price, String color) {
        super(quantity, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double discount() {
        return 1;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "color='" + color + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
