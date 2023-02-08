package LessonStreams;

import lesson2.Cat;
import lesson2.Tiger;

import java.io.FilterOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class AppReflection {
    public static void main(String[] args) {
        Cat cat = new Cat("Васька");
        Tiger tiger = new Tiger();
        Class<? extends Cat> catClass = cat.getClass();
        Class<? extends Cat> tigerClass = tiger.getClass();
  /*      System.out.println("Cats methods");
        for (Method method : catClass.getDeclaredMethods()) {
            System.out.println(method);
        }
        System.out.println("Tiger methods");
        for (Method method : tigerClass.getDeclaredMethods()) {
            System.out.println(method);
        }
*/
        //fields
        System.out.println("Cats fields");
        for (Field field : catClass.getDeclaredFields()) {
            System.out.println(field);
            int modifiers = field.getModifiers();
            if (Modifier.isPrivate(modifiers)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Изменить приватную переменную" + field.getName() + "?");
                String choose = scanner.next();
                if (choose.equals("Y")) {

                    try {
                        field.setAccessible(true);
                        System.out.println("BEFORE");
                        System.out.println(field.get(cat));
                        field.set(cat, scanner.next());
                        System.out.println("AFTER");
                        System.out.println(field.get(cat));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }


                }
                scanner.close();
            }
        }
        System.out.println("Tiger fields");
        for (Field field : tigerClass.getDeclaredFields()) {
            System.out.println(field);


        }
        try {
            Method printString = tigerClass.getDeclaredMethod("printString", String.class);
            printString.setAccessible(true);
            printString.invoke(tiger, "Sout string");
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
        for (Annotation annotation : catClass.getDeclaredAnnotations()) {
            System.out.println(annotation);
        }
        //List<Method>  tigerClassDeclaredMethods =  tigerClass.getDeclaredMethods();
        //stream(tigerClass.getDeclaredMethods()).toList().stream().peek({})

    }
}
