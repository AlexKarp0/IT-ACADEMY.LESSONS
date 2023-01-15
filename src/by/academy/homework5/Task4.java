package by.academy.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;

public class Task4 {
    public  static int STUDENTS_COUNT = 100;
    public static void main(String[] args) {
        double maxGrade = Double.MIN_VALUE;
        Random random = new Random();
        ArrayList<Student> students = new ArrayList<>(STUDENTS_COUNT);
        for (int i = 0; i < STUDENTS_COUNT; i++) {
            Student student = new Student(random.nextDouble(10), UUID.randomUUID().toString());
            students.add(i,student);
        }
        System.out.println(students);
        Iterator<Student>  iterator = students.iterator();
        while ( iterator.hasNext()) {
            Student student  = iterator.next();
            if (maxGrade < student.getGrade()) {
                maxGrade = student.getGrade();
            }
        }
        System.out.println(maxGrade);
    }
}
