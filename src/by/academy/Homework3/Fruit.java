package by.academy.Homework3;

public class Fruit extends Product {

    String country;
    FruitType type;

    public Fruit(String country, FruitType type) {
        this.country = country;
        this.type = type;
    }

    public Fruit(double quantity, double price, String name, String country, FruitType type) {
        super(quantity, price, name);
        this.country = country;
        this.type = type;
    }

    public Fruit(double quantity, double price, String country, FruitType type) {
        super(quantity, price);
        this.country = country;
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    protected double discount() {
        if (type == FruitType.STONEFRUIT) { return 0.9;}
        else if (type == FruitType.POMEFRUIT) { return 0.95;}
        else if (type == FruitType.CITRUS) { return  0.85;}
        else return 1;
        }

    public FruitType getType() {
        return type;
    }

    public void setType(FruitType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "country='" + country + '\'' +
                ", type=" + type +
                ", quantity=" + quantity +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
