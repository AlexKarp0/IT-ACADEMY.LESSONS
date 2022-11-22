package by.acadmy.lesson1;

public class People {
    public static void main(String[] args){
        Man m1 = new Man();
        m1.age = 234;
        System.out.println(m1.getAge());
        m1.grow();
        System.out.println(m1.getAge());
        Man m2 = new Man(20);
        System.out.println(m2.getAge());
    }
}
