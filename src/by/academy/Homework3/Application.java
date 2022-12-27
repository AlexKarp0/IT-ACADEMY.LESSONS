package by.academy.Homework3;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //FruitType.
//        System.out.println("app");
//        Cheese cheese = new Cheese(1001,0.1,2);
//        System.out.println(cheese.toString());
//        System.out.println(cheese.calcPrice());
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        //Product product = menu.getProduct(scanner);
        //System.out.println(product);
        Person person = menu.getPerson(scanner);
        System.out.println(person.toString());
        scanner.close();
    }
}
