package lesson4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[15];
        int countOdd = 0;
        Random rn = new Random();
        for (int i = 0; i < a.length; ++i) {
            a[i] = rn.nextInt(10);
            countOdd += a[i] % 2 == 0 ? 1 : 0;

        }
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("Count ODD " + countOdd);
    }
}
