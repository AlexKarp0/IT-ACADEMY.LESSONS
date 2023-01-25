package LessonLambda;


import LessonCollections.HeavyBox;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// TASKS 1--6
public class ApplicationLabmda {

    public static void main(String[] args) {
        Printable p = () -> {
            System.out.println("print from main");
            return;
        };
        p.print();
        // task2
        System.out.println("task2");
        Predicate<String> isNotNull = (s) -> {
            return s != null;
        };
        String testString  = "234";
        System.out.println(isNotNull.test(testString));
        //task 3
        System.out.println("Task3");
        Predicate<String> isNotempty = (s) -> {
            return s == null ? false : !s.isEmpty();
        };
        System.out.println(isNotempty.test(""));
        //task 4
        System.out.println("task4 ");
        System.out.println(isNotNull.and(isNotempty).test("123"));
        //task5
        System.out.println("Task5");
        Predicate<String> firstJ = (s) ->{  return s.isEmpty() ? false :  s.charAt(0) == 'J';};
        Predicate<String> firstN = (s) ->{  return s.isEmpty() ? false :  s.charAt(0) == 'N';};
        Predicate<String> lastA = (s) ->{  return s.isEmpty() ? false :  s.charAt(s.length()-1) == 'A';};
        System.out.println(firstJ.or(firstN).and(lastA).test("NssdfsdfdsgA"));
        // task6
        System.out.println("task6");
        Consumer<HeavyBox> send = (heavyBox) ->{
            System.out.println("отправили ящик с весом " + heavyBox.getWeight());
        };
        Consumer<HeavyBox> load = (heavyBox -> System.out.println("отгрузили ящик с весом" + heavyBox.getWeight()));
        load.andThen(send).accept(new HeavyBox(1000,10,10,10));
        Function<Double,Double> test = v -> Math.abs(v);
        //task7
        System.out.println("Task 7");
        Function<Number,String> isPositive = d -> {
            return  d.doubleValue() > 0 ?"Положительное" : "Отрицательное";
        };
        System.out.println(isPositive.apply(132));
    }
   // public static Number printStatic(){
//        System.out.println("Print from static method");
//    }
}
