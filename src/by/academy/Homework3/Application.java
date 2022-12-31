package by.academy.Homework3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

//        System.out.println("app");
//        Cheese cheese = new Cheese(1001,0.1,2);
//        System.out.println(cheese.toString());
//        System.out.println(cheese.calcPrice());
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Deal deal = new Deal();
        menu.mainMenu(scanner,deal);
//        Product[] arr = new Product[3];
//        arr[0] = new Cheese(12,2,3);
//        arr[1] = new Champagne(14.2,15,"prosecco","white",1);
//        deal.addProduct( new Cheese(12,2,3));
//        deal.addProduct( new Champagne(14.2,15,"prosecco","white",1));
//        deal.printReceipt(deal.products);

        Validator validator = new BelarusPhoneValidator();
        String phoneNumber = "+375336054166";
        if (validator.validate(phoneNumber)) {
            System.out.println("Belarus phone -- Validate");
        } else {
            System.out.println(" Belarus phone -- Not validate");
        }
        Validator usaPhone = new UsaPhoneValidator();
        if (usaPhone.validate(phoneNumber)) {
            System.out.println("USA phone -- Validate");
        } else {
            System.out.println(" USA phone -- Not validate");
        }

        scanner.close();
    }
}
