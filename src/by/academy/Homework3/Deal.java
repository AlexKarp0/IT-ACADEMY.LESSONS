package by.academy.Homework3;

import java.time.LocalDate;

public class Deal {
    protected  Person buyer;
    protected Person seller;
    protected LocalDate deadline;
    Product[] products;

    public Deal() {
        // подсчет всей суммы с сделки
        // перевод денег
        // генерация чека в отдельном методн
    }

    public Deal(Person buyer, Person seller, Product... products) {
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
        this.deadline = LocalDate.now().plusDays(10);
    }
}
