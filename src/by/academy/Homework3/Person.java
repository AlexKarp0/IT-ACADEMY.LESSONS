package by.academy.Homework3;

import java.io.Serializable;
import java.time.LocalDate;

public class Person  {
    private String name;
    private double money;
    private LocalDate birthDay;
    public Person(){
        super();
    }
    public Person(String name, double money) {
        this.name = name;
        this.money = money;//  money > 0 ? money : 0;
    }

    public Person(String name, double money, LocalDate birthDay) {
        this.name = name;
        this.money = money;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", money=" + money +
                ", birthDay=" + birthDay +
                '}';
    }
}

