package by.academy.Homework3;

import java.math.BigDecimal;

public class Person {
    private String name;
    private BigDecimal money;
    public Person(){
        super();
    }
    public Person(String name, BigDecimal money) {
        this.name = name;

        this.money =money;//  money > 0 ? money : 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
