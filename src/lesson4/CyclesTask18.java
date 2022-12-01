package lesson4;

import java.util.Scanner;

public class CyclesTask18 {
    public static void main(String[] args) {
        int res = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N");
        int n = 15;// sc.nextInt();
        for (int i = 1; i < n ; ++i){
            if (!(i % 2 == 0 || i % 3 == 0 || i % 5 == 0 )) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        sc.close();
        int x = 2 * 2 * 2 * 2 * 2  *2;
        System.out.println(Math.pow(x, -6));
        System.out.println(Math.subtractExact(Integer.MIN_VALUE, Integer.MAX_VALUE));


    }
}
