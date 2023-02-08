package LessonStreams;

import java.util.List;
import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
Промежуточные операции:

1. Сгенерировать 1000 чисел в диапазоне от 500 до 1500 используя Stream API.
2. Нужно пропустить первые 100 элементов.
3. Оставить только нечетные числа.
4. Отсортировать числа.
5. Оставить только уникальные значения.
6. Преобразовать с помощью map числа в строки в формате: "Строка с номером: " + n
7. Органичить количество элементов 350.
8. Сгенерировать List (.collect(Collectors.toList())
* */
/*
1. Найти min/max с помощью Stream API.
2. Проверить, есть ли в коллекции строка, которая equals строке "Число 500"
* */
public class Task1 {
    public static void main(String[] args) {
     List<String> list = generateList(1000,1000)
             .stream()
             .skip(100)
             .map(i -> i +500)
             .filter(i -> i %2 == 1)
             .sorted((o1, o2) -> -o1.compareTo(o2))
             .distinct()
             .map(i -> "Строка с номером: " + String.valueOf(i) )
             .limit(350)
             .collect(Collectors.toList());
        System.out.println(list);
        String res = list.stream().sorted((o1, o2) -> o1.compareTo(o2)).findFirst().get();
        System.out.println(res);
        String res1 = list.stream().filter(s -> s.matches("Строка с номером: 1001")).findFirst().orElse("Строка не найдена");
        System.out.println(res1);

    }
    private static List<Integer> generateList (int bound, int size){
        Supplier<Integer> generator = () -> new Random().nextInt(bound);
        return Stream.generate(generator).limit(size).toList();
    }
}
