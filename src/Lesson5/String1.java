package Lesson5;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class String1 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int minIndex = -1;
        int maxIndex = -1;
        int minLength = Integer.MAX_VALUE;
        int maxLength = Integer.MIN_VALUE;
        System.out.println("ENTER N");
        int n = sc.nextInt();
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter string number " + (i+1));
            a[i] = sc.next();
            if (a[i].length() > maxLength){
                maxLength = a[i].length();
                maxIndex = i;
            }
            if (a[i].length() < minLength){
                minLength = a[i].length();
                minIndex = i;
            }
        }
        System.out.println("SHORTEST STRING " + a[minIndex]);
        System.out.println("LONGEST STRING " + a[maxIndex]);
        sc.close();
    }
}
