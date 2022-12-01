package lesson4;

import java.util.Scanner;

public class CyclesTask4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int zeroCount = 0;
        int plusCount = 0;
        int minusCount = 0;
        for (int i = 0; i < n ; ++i){
            int number = sc.nextInt();
            if (number < 0){
                minusCount++;
            } else if (number > 0) {
                plusCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Minus count = " + minusCount);
        System.out.println("Zero count = " + zeroCount);
        System.out.println("Plus count = " + plusCount);
        sc.close();
    }
}
