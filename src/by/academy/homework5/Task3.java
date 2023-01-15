package by.academy.homework5;

import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        Integer [][] arr = {{1,2,3},{4,5,6,9},{7,8}};
        //это выглядит странно, но формально мы мы не добиваем nullами до размерности самого большого
        Iterator<Integer> iterator = new CustomIterator<Integer>(arr);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
