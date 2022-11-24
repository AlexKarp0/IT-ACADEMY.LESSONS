package lesson4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] a = new int[10];
        int countOdd = 0;
        Random rn = new Random();
        for (int i = 0; i < a.length; ++i) {
            a[i] = rn.nextInt(10) +1;
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
            if (i % 2 == 1){
                a[i] = 0;
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
}
