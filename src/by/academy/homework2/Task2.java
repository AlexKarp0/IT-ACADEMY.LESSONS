package by.academy.homework2;
import java.util.Scanner;

//Ввести n слов с консоли. Найти со, в котором число различных символов минимально.
//        Если таких слов несколько, найти первое из них.
//  Что есть переое? будем для усложнения считать первое лексикографисчески
public class Task2 {
    static int getCountUnique(String s){
        int countUnique = 0;
        for (int i = 0; i < s.length(); i++) {
           if (s.indexOf(s.charAt(i),i+1) == -1)
               countUnique++;
        }
        return countUnique;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        String[] a = new String[n];
        int[] uniqueSymbols = new int[n];
        int minUnique = Integer.MAX_VALUE;
        System.out.println("Enter strings");
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.next();
            uniqueSymbols[i] = getCountUnique(a[i]);
            if (minUnique > uniqueSymbols[i])
                minUnique = uniqueSymbols[i];
        }
        String res = "";
        for (int i = 0; i < a.length; i++) {
            if (("".equals(res) || res.compareTo(a[i]) > 0)
            &&  uniqueSymbols[i] == minUnique)
                res = a[i];
        }
        System.out.println(res);
        scanner.close();
    }
}
