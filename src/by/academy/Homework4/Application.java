package by.academy.Homework4;

import by.academy.Homework3.BDValidator;
import by.academy.Homework3.Validator;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       /* CustomArrayList<Integer> list = new CustomArrayList<>();
        list.print();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.print();
        list.remove(1);
        list.print();
        System.out.println(list.get(3));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());*/
        Scanner scanner = new Scanner(System.in);
        Validator validatorBD = new BDValidator();
        while (true){
            System.out.println("Enter Date");
            String stringDate = scanner.next();
            if (validatorBD.validate(stringDate)){
                CustomDate  customDate = new CustomDate(stringDate);
                System.out.println(customDate);
                break;
            }
        }
        scanner.close();


    }
}
