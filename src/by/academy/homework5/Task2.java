
package by.academy.homework5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
//public static final int SIZE = 100_000;
//    public static final int REPEATS = 1_000_000;
//Array List add into middle
//        0.198
//        Linked List add into middle
//        5.443
//        Array list get random position
//        0.015
//        avg position = 49972.107128
//        Linked list get random position
//        55.938
//        avg position = 49951
//
//        Process finished with exit code 0

public class Task2 {

    public static final int SIZE = 100_000;
    public static final int REPEATS = 1_000_000;

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        LocalDate dateStart = LocalDate.now();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(arrayList.size()/2,i);
        }
        LocalDate dateEnd = LocalDate.now();
        System.out.println("Array List add into middle");
        long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        System.out.println((double) diff / 1000.0);
        // Linked List into middle
        startTime = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(linkedList.size()/2,i);
        }
        dateEnd = LocalDate.now();
        System.out.println("Linked List add into middle");
        endTime = System.currentTimeMillis();
        diff = endTime - startTime;
        System.out.println((double) diff / 1000.0);

        // Query from ArrayList
        Random random = new Random();
        startTime = System.currentTimeMillis();
        long sumPosition = 0;
        for (int i = 0; i < REPEATS; i++) {
            int index = random.nextInt(arrayList.size());
            int value = arrayList.get(index);
            sumPosition += index;
        }
        dateEnd = LocalDate.now();
        System.out.println("Array list get random position");
        endTime = System.currentTimeMillis();
        diff = endTime - startTime;
        System.out.println((double) diff / 1000.0);
        System.out.println("avg position = " + (double)sumPosition / REPEATS);

        // Query from LinkedList
        //Random random = new Random();
        startTime = System.currentTimeMillis();
        sumPosition = 0;
        for (int i = 0; i < REPEATS; i++) {
            int index = random.nextInt(linkedList.size());
            int value = linkedList.get(index);
            sumPosition += index;
        }
        dateEnd = LocalDate.now();
        System.out.println("Linked list get random position");
        endTime = System.currentTimeMillis();
        diff = endTime - startTime;
        System.out.println((double) diff / 1000.0);
        System.out.println("avg position = " + sumPosition / REPEATS);
    }
}
