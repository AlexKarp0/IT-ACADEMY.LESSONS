package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();
        char[] a = new char[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) ('a' + rand.nextInt(26));
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    char temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
