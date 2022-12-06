package by.academy.homework2;


import java.sql.SQLOutput;
import java.util.Scanner;

//Условие здачи: ввести 2 слова, состоящие из четного числа букв.
//Получить слово состоящее из первой половины первого слова и второй половины второго слова.
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = scanner.next();
        System.out.println("Enter second string");
        String s2 = scanner.next();
        String res = s1.substring(0,s1.length()/2) + s2.substring(s2.length()/ 2 );
        System.out.println(res);
        scanner.close();

    }
}
