package OOP;

import java.util.Arrays;

public class LessonOOP {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("samsung","S",123);
        Phone phone3 = new Phone();
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);

        phone1.receiveCall("Вася");
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone2.getNumber());
        phone1.receiveCall("Ваня","+37500000");
        String[] numbers = {"message 1 ", "message 2","3","4"};
        phone1.sendMessage(numbers);
        System.out.println(Arrays.deepToString(numbers));

        Person person1 = new Person();
        person1.setAge(13);
        person1.setFullName("NAME NAME");
        person1.move();
        person1.talk();
        Person person2 = new Person("Василий",45 );
        person2.move();
        person2.talk();
    }
}
