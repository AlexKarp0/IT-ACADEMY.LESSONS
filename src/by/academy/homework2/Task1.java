package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
//    Задание 1.
//    Ввести две строки с консоли. Определить, является ли одна строка перестановкой символов другой строки. Учитываем регистр. Не использовать сортировку :)
//    Например:
//            1.	“hello” и “hlleo” -> true
//            2.	“hello” и “art” -> false
    public static boolean compare(String s1, String s2){
        if (s1.length() != s2.length()) {
         return false;
        }

        int[] symbols= new int[(int)Character.MAX_VALUE];
        for (int i = 0; i < s1.length(); i++) {
            symbols[(int)s1.charAt(i)]++;
            symbols[(int)s2.charAt(i)]--;
        }
        for (int symbol : symbols) {
            if (symbol !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.next();
        System.out.println("Enter second string");
        String s2 = sc.next();
        System.out.println(compare(s1,s2));
        sc.close();

    }
}
