package by.academy.homework2;

import java.util.Arrays;
import java.util.Scanner;
//Дан массив с int переменными, определить количество пар, разность которых эквивалентна заданному с консоли target значению.
//        Например, дан массив чисел [1,2,3,4] и введенное с консоли target значение 1, у нас есть три пары, которые подходят под заданное условие: 2-1=1, 3-2=1, 4-3=1.
//        Нужно дописать код в pairs функции, которая принимает массив int значений и target int переменную, которая бы возвращала количество пар с заданной разностью.
//        Параметры:
//        •	k: int, target переменная, разница
//        •	arr: массив int значений
//        Формат ввода:
//        •	Первая строка принимает 2 значения отделенных пробелом, размер массива arr и target значение. (n и k)
//        •	Вторая строка содержит n отделенных друг от друга int значений массива arr.
//        Ограничения:
//        •	каждое значение arr[i] должно быть уникальным
//
//        Формат вывода:
//        Целочисленное число, отображающее количество пар, разность которых равна k (target переменной)


public class Task0 {
    static int pairs (int k, int[] arr){
        int pairsCount = 0;
        Arrays.sort(arr);// n * LogN
        int l = 0;
        int r = 1;
        //System.out.println(Arrays.toString(arr));
        while (r < arr.length){
            //System.out.println(l + " " + r);
            if (arr[r] - arr[l] == k ){
                l++;
                r++;
                pairsCount++;
            } else if (arr[r] - arr[l] > k) {
                l++;
            } else {
                r++;
            }

        }
        return pairsCount;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
           // System.out.println(arr[i]);
        }

        int result = pairs(k, arr);
        System.out.println(result);

        scanner.close();

    }
}
