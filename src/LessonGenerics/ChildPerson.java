package LessonGenerics;

import by.academy.Homework3.Person;

import java.io.Serializable;
import java.time.LocalDate;

public class ChildPerson extends Person implements Serializable {
    public ChildPerson() {
    }

    public ChildPerson(String name, double money) {
        super(name, money);
    }

    public ChildPerson(String name, double money, LocalDate birthDay) {
        super(name, money, birthDay);
    }
}
