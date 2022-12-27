package by.academy.Homework3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public Person getPerson(Scanner scanner) {
        System.out.println("Enter person Name");
        String personName = scanner.next();
        System.out.println("Enter money amount");
        double money = 0;
        LocalDate birthday;
        if (scanner.hasNextDouble()) {
            money = scanner.nextDouble();
        }
        while (true){
            System.out.println("Enter BD");
            if (scanner.hasNext("([0-2][0-9]||3[0-1])/(0[0-9]||1[0-2])/(19||20)[0-9]{2}") || scanner.hasNext("([0-2][0-9]||3[0-1])-(0[0-9]||1[0-2])-(19||20)[0-9]{2}")) {
              String birthDate = scanner.next();
              birthday = LocalDate.of(Integer.parseInt(birthDate.substring(6,10)),
                      Integer.parseInt(birthDate.substring(3,5)),
                      Integer.parseInt(birthDate.substring(0,2)));
                break;
            }
            String wrong = scanner.next();


        }

        return new Person(personName, money,birthday);
    }
    public static FruitType findByIndex(int  index){
        for(FruitType fruitType : FruitType.values()){
            if( fruitType.index == index){
                return fruitType;
            }
        }
        return null;
    }


    public Product getProduct(Scanner scanner) {
        Product retProduct = null;
        System.out.println("Choose new product:");
        System.out.println("1) Cheese");
        System.out.println("2) Fruit");
        System.out.println("3) Wine");
        System.out.println("4) Champagne");
        int choose = 0;
        if (scanner.hasNextInt()) {
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter age of cheese");
                    int age = scanner.nextInt();
                    Cheese cheese = new Cheese(age);
                    retProduct = cheese;
                    break;
                case 2:
                    System.out.println("Enter origin country");
                    String country = scanner.next();
                    //получение списка из enumа
                    System.out.println("Choose type of Fruit:");
                    FruitType[] fruitTypes = FruitType.values();
                    for (FruitType fruitType : fruitTypes) {
                        System.out.println(fruitType.index + ") --" +fruitType.desc );
                    }
                    //получение типа по индексу
                    int fruitType = scanner.nextInt();
                    Fruit fruit = new Fruit(country,findByIndex(fruitType));
                    retProduct = fruit;
                    break;
                case 3:
                    System.out.println("Enter Wine color");
                    String color = scanner.next();
                    Wine wine = new Wine(color);
                    retProduct = wine;
                    break;
                case 4:
                    System.out.println("Enter champain color ");
                    String champagneColor = scanner.next();
                    System.out.println("Enter co2 (int) ");
                    int co2 = scanner.nextInt();
                    Champagne  champagne = new Champagne(champagneColor,co2);
                    retProduct = champagne;
                    break;
                default:
                    System.out.println("Wrong number");
                    return null;
            }
            System.out.println("Enter product price");
            retProduct.setPrice(scanner.nextDouble());
            System.out.println("Enter product quantity");
            retProduct.setQuantity(scanner.nextDouble());
            System.out.println("Enter product name");
            retProduct.setName(scanner.next());


        }
        return  retProduct;
    }
}
