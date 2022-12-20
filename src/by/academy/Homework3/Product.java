package by.academy.Homework3;

public abstract class Product {
    private double quantity;
    private double price;
    public Product(){
        super();
    }
    public Product(double quantity, double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    double getFullPrice (){
        return quantity * price;
    }
    protected abstract double discount();
    final double calcPrice(){
        return getFullPrice() * discount();
    }

    @Override
    public String toString() {
        return  this.getClass() +"[" +
                "quantity=" + quantity +
                ", price=" + price +
                ']';
    }
}
