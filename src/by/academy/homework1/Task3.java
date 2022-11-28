package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        if (sc.hasNextInt()){
            number = sc.nextInt();
        }
        for (int i = 1; i <=10; ++i){
            System.out.println(number + " * " + i + " "+ " = " +  number * i +";");
        }
        sc.close();
    }
}
