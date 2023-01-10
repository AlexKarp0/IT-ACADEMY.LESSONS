package by.academy.Homework4;

import java.util.Arrays;

/*
Задание 3.
Создать класс, который параметризуется любым типом (T). Имеет массив объектов нашего типа T.
Содержит пустой конструктор, который по дефолту инициализирует пустой массив размерности 16.
Содержит конструктор, принимающий значение int и инитает им размер нашего массива.

Содержит методы:
1) добавления в наш массив объекта типа T - add(T obj) (нужно помнить, что если массив заполнен, нам нужно его расширить с помощью Arrays.copyOf)
2) взятие по индексу get(int i)
3) взятие последнего элемента getLast()
4) взятие первого элемента getFirst()
5) вывод размера массива
6) вывод индекса последнего заполненого элемента (не путать с размерностью)
7) удаление элемента по индексу (remove(int i)
8) удаление элемента по значению (remove(T obj))

* */
public class CustomArrayList<T> {
    private static final int DEFAULT_CAPACITY = 16;
    private T[] arr;
    private int index;
    public T remove(int i){
        T t = arr[i];
        System.arraycopy(arr,i + 1,arr,i,index - i);
        arr[index--]= null;
        return t;

    }
    public int getSize()
    {
        return index;
    }

    public T get(int index) {
        return arr[index];
    }

    public int capacity()
    {
        return arr.length;
    }
    public T getFirst() {
        return  index == 0 ? null : arr[0];
    }

    public T getLast() {
        return  index == 0 ? null : arr[index - 1];
    }

    public void print() {
        System.out.print("[");

        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]+",");
        }
              System.out.println("]");
    }

    public void add(T obj) {
        if (index == arr.length) {
            grow();
        }
        arr[index] = obj;
        index++;
    }

    private void grow() {
        T[] newArr = (T[]) new Object[arr.length * 2 + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    public CustomArrayList() {
        super();
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public CustomArrayList(int capacity) {
        super();
        this.arr = (T[]) new Object[capacity];
    }
    public void delete(T t){
        for (int i = 0; i < index; i++) {
          if (arr[i].equals(t)){
              remove(i);
              return;
          }
        }
    }


}
