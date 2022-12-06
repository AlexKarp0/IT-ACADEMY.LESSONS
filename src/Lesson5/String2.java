package Lesson5;

import java.util.Arrays;
import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N");
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string number " + (i + 1));
            a[i] = sc.next();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i +1; j < a.length; j++) {
                if (a[i].compareTo(a[j]) < 0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(a));
    }
}