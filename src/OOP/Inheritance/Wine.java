package OOP.Inheritance;

public class Wine extends  Product {
     protected String color;

    public Wine() {
        super();
    }

    public Wine(String color) {
        super("Wine");
        this.color = color;
    }

    public Wine(String name, double price, int quantity, String color) {
        super(name, price, quantity);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
