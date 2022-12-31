package by.academy.Homework3;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Menu {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void dealMenu(Scanner scanner, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Choose menu :");
            System.out.println("1 -- Deal");
            System.out.println("2 -- Print receipt");
            System.out.println("0 -- return");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    deal.deal();
                    break;
                case 2:
                    deal.printReceipt();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choose again");

            }
        }
    }

    public void productMenu(Scanner scanner, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Choose menu :");
            System.out.println("1 -- Print products array");
            System.out.println("2 -- Create and add product to deal");
            System.out.println("3 -- Delete product by number");
            System.out.println("0 -- return");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    deal.printProducts();
                    break;
                case 2:
                    Product newProduct = getProduct(scanner);
                    deal.addProduct(newProduct);
                    break;
                case 3:
                    deal.printProducts();
                    ;
                    System.out.println("Choose number product to  remove");
                    int index = scanner.nextInt();
                    deal.deleteProduct(index - 1);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choose again");
                    ;
            }
        }
    }

    public void mainMenu(Scanner scanner, Deal deal) {
        clearScreen();
        while (true) {
            System.out.println("Choose menu :");
            System.out.println("1 -- Create Buyer");
            System.out.println("2 -- Create Seller");
            System.out.println("3 -- Product menu");
            System.out.println("4 -- Deal menu");
            System.out.println("0 -- return");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    Person buyer = getPerson(scanner);
                    deal.setBuyer(buyer);
                    break;
                case 2:
                    Person seller = getPerson(scanner);
                    deal.setSeller(seller);
                    break;
                case 3:
                    productMenu(scanner, deal);
                    break;
                case 4:
                    dealMenu(scanner, deal);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("choose again");
            }
        }

    }

    public Person getPerson(Scanner scanner) {
        System.out.println("Enter person Name");
        String personName = scanner.next();
        System.out.println("Enter money amount");
        double money = 0;
        LocalDate birthday;
        if (scanner.hasNextDouble()) {
            money = scanner.nextDouble();
        }
        Validator validatorBD = new BDValidator();
        while (true) {
            System.out.println("Enter BD");
            String s = scanner.next();
            if (validatorBD.validate(s)) {
                String birthDate = s;
                birthday = LocalDate.of(Integer.parseInt(birthDate.substring(6, 10)),
                        Integer.parseInt(birthDate.substring(3, 5)),
                        Integer.parseInt(birthDate.substring(0, 2)));
                break;
            }
            System.out.println("Wrong DB format");
            //String wrong = scanner.next();


        }

        return new Person(personName, money, birthday);
    }

    public static FruitType findByIndex(int index) {
        for (FruitType fruitType : FruitType.values()) {
            if (fruitType.index == index) {
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
                        System.out.println(fruitType.index + ") --" + fruitType.desc);
                    }
                    //получение типа по индексу
                    int fruitType = scanner.nextInt();
                    Fruit fruit = new Fruit(country, findByIndex(fruitType));
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
                    Champagne champagne = new Champagne(champagneColor, co2);
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
        return retProduct;
    }
}
