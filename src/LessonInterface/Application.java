package LessonInterface;

import java.util.Arrays;
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        Printable[] arr = new Printable[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            int x = random.nextInt(2);
            if (x == 0) {
                arr[i] = new Book("book " + i);
            } else
                arr[i] = new Magazine("Creator" + i);
        }
        System.out.println(Arrays.toString(arr));
        Magazine.printMagazines(arr);
    }
}
