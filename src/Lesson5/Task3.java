package Lesson5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER N");
        int n = sc.nextInt();
        int sumLength = 0;
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string number " + (i + 1));
            a[i] = sc.next();
            sumLength += a[i].length();
        }
        int avg = sumLength / n;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() <= avg) {
                System.out.println(a[i]+ " " + a[i].length());
            }
        }
        sc.close();
    }
}
