package by.academy.homework1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input Type");
        String inputType  = sc.next();
        System.out.println("Enter value");
        switch (inputType){
            case "int" :
                int i = sc.nextInt();
                System.out.println("Int " + i % 2);
                break;
            case "double" :
                double d =sc.nextDouble();
                System.out.println("Double "  + 0.7 * d);
                break;
            case "float" :
                float f =sc.nextFloat();
                System.out.println("Double "  + f * f);
                break;
            case "char" :
                char c = sc.next().charAt(0);
                System.out.println("Char " +  c );
                break;
            case "String":
                String s = sc.next();
                System.out.println("String: Hello  "  + s) ;
                break;
            default:    System.out.println("Unsupported type") ;
        }

        sc.close();
    }
}
