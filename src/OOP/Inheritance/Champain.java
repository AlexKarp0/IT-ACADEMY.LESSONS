package OOP.Inheritance;

public class Champain extends Wine {
    int co2;
    public Champain(){
        super();
    }
    public Champain(String name, double price, int quantity, String color, int co2) {
        super(name, price, quantity, color);
        this.co2 = co2;
    }

    public int getCo2() {
        return co2;
    }

    public void setCo2(int co2) {
        this.co2 = co2;
    }

}
