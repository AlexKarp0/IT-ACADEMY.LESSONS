package lesson4;

import java.util.Arrays;

public class ArraysTask2 {
    public static void main(String[] args) {
        String[][] arr = new String[3][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                String s = "" + (char) ('a' + i) + (j+1);
                arr[i][j] = s;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(arr));
    }

}
