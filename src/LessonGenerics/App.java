package LessonGenerics;

import by.academy.Homework3.Person;

import java.awt.desktop.AboutEvent;

public class App {
    public static void main(String[] args) {
       // Calculator calculator = new Calculator();
//        int a = 0;
//        double x = 10;
//        System.out.println(Calculator.sum(a,x));
//        System.out.println(Calculator.multiply(a,x));
//        System.out.println(Calculator.subtraction(13.0,x));
        GenericClass<?,?,?> test = new GenericClass<String,ChildPerson,Float>("23e", new ChildPerson("Petr",999), 8345.0f);
        test.printTypes();

    }
}
