package LessonStreams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AppStreams {
    public static void main(String[] args) {
        System.out.println(Stream.of("TEST1", "TEST2", "TEST4").collect(Collectors.joining(", ")));
        List<Integer> list = generateList(10, 5);
        System.out.println(list);
    }

    private static List<Integer> generateList(int bound, int size) {
        Supplier<Integer> generator = () -> new Random().nextInt(bound);
        return Stream.generate(generator).limit(size).toList();
    }
}
