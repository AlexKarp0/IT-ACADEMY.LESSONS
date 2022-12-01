package lesson4;

import java.util.Random;

public class ArrayTask1 {
    public static void  printArray(int[] array){
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        for (int i = 0 ; i < arr.length; ++i){
            arr[i] = rand.nextInt(10);
        }
        printArray(arr);
        for (int i = 0 ; i < arr.length; ++i){
            arr[i] += 10;
        }
        System.out.println(arr.toString());
        printArray(arr);;

    }
}
