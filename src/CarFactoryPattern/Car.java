package CarFactoryPattern;

import java.util.Objects;

public abstract class Car {
    private String model;
    private String number;
    private String color;
    private double maxSpeed;

    public Car(String model, String number, String color, double maxSpeed) {
        super();
        this.model = model;
        this.number = number;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.maxSpeed, maxSpeed) == 0 && model.equals(car.model) && number.equals(car.number) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, number, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
