package Lesson5;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask18 {

    public static void main(String[] args) {
        int[][] a = new int[15][2];
        for (int i = 0; i < 15; ++i) {
            Random rand = new Random();
            boolean isDuplicate = true;
            int first = 0;
            int second = 0;

            while (isDuplicate) {
                isDuplicate = false;
                do {
                    first = rand.nextInt(9) + 1;
                } while (first == 1);
                do {
                    second = rand.nextInt(9) + 1;
                } while (second == 1);
                for (int j = 0; j < i; ++j) {
                    if ((a[j][0] == first && a[j][1] == second)
                            || (a[j][1] == first && a[j][0] == second)) {
                        isDuplicate = true;
                        break;
                    }
                }

            }
            System.out.print("[" + first + " " + second + "],");
            a[i][0] = first;
            a[i][1] = second;

        }
        System.out.println(Arrays.toString(a));
    }
}
