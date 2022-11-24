package lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Get first number");
        int a = sc.nextInt();
        System.out.println("Get second number");
        int b = sc.nextInt();
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        double avg = (double) (a + b) / 2;
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
        System.out.println("Avg = " + avg);
        sc.close();
    }
}
