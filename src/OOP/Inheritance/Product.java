package OOP.Inheritance;

public class Product {
    String name;
    protected double price;
    protected int quantity;

    public Product() {
        super();
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double calcPrice() {
        return quantity * price;
    }
    public double discount(){
        return 1;
    }

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  this.getClass()+
                "[" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ']';
    }
}
