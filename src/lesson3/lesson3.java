package lesson3;

import java.util.Scanner;

public class lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = scanner.nextLine();
        System.out.println("Enter Gende");
        char gender = scanner.next().charAt(0);
        System.out.println("How old are You?");
        int age = scanner.nextInt();

    }
}

