package LessonGenerics;

import by.academy.Homework3.Person;

import java.io.Serializable;

public class GenericClass <T extends Comparable, V extends Person & Serializable, K extends Number>{
    private T t;
    private V v;
    private K k;

    public GenericClass(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }
    public void printTypes(){
        System.out.println("T class is " + t.getClass().getName());
        System.out.println("V class is " + v.getClass().getName());
        System.out.println("K class is " + k.getClass().getName());
    }
}
