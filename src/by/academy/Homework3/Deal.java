package by.academy.Homework3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Deal {
    protected  Person buyer;
    protected Person seller;
    protected LocalDate deadline;
    private int lastProduct;
    protected  boolean isCompleted;

    public boolean isCompleted() {
        return isCompleted;
    }

    Product[] products;

    public Person getBuyer() {
        return buyer;
    }

    public void setBuyer(Person buyer) {
        this.buyer = buyer;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }
    public void printProducts(){
        if (lastProduct == 0){
            System.out.println("products array is empty");
            return;
        }
        for (int i = 0; i < lastProduct; i++) {
            System.out.println("Product[" + (i+1) + "]"+ products[i].toString());
        }
    }
    public void addProduct(Product newProduct){
        if (isCompleted){
            return;
        } else {
            if (lastProduct == products.length) {
                Product[] newArray = new Product[products.length * 2 + 1];
                System.arraycopy(products, 0, newArray, 0, products.length);
                products = newArray;
            }
            products[lastProduct] = newProduct;
            lastProduct++;
        }
    }

    public Deal(){
        isCompleted = false;
        products = new Product[2];
        lastProduct = 0;
    };
    public Deal(Person buyer, Person seller, Product... products) {
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
        this.deadline = LocalDate.now().plusDays(10);

    }
    public void printReceipt(){
        if (!isCompleted) {
            System.out.println("Deal not complete yet");
            return;
        }
        System.out.println("Сделка совершена продавцом : " + seller.getName() + "  и покупателем "+ buyer.getName());
        System.out.println("Чек сделки готов");
        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String deadlineDate = deadline.format(formatter);
        System.out.format("Дата:              %s",deadlineDate);
        System.out.println();
        System.out.println("Продукт  |кол-во  |цена    |сума с учетом скидки");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < lastProduct; i++) {
            System.out.format("%-8s |%-8s|%-8s0|%-8s ",products[i].getName(),
                    products[i].getQuantity(),products[i].getPrice(),products[i].getFullPrice());
            System.out.println();

        }
        System.out.println("------------------------------------------------");


    }
    public void deal(){
        if (isCompleted){
            System.out.println("Deal already completed");
            return;
        }
        if (buyer == null ||
            seller == null ||
                buyer == seller ){
            System.out.println("Deal can not be completed");
        }
        double finalPrice = 0;
        for (Product product : products) {
            if (product != null)
            finalPrice += product.getPrice();
        }
        if (Double.compare(buyer.getMoney(),finalPrice) < 0 ){
            System.out.println("Deal can not be completed. Not enough money");
            return;
        }
        buyer.setMoney(buyer.getMoney() - finalPrice );
        seller.setMoney(seller.getMoney() +  finalPrice);
        isCompleted = true;
        deadline = LocalDate.now().plusDays(10);
        System.out.println("Congratulation with deal");



    }
    public void  deleteProduct(int index){
        if (isCompleted) {
            return;
        }  else {
            if (index >= lastProduct) {
                return;
            }
            products[index] = null;
            for (int i = index; i < lastProduct; i++) {
                products[i] = products[i + 1];
            }
            lastProduct--;
        }
    }
}
