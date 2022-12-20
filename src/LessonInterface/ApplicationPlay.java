package LessonInterface;

import java.util.Random;

public class ApplicationPlay {
    public static void main(String[] args) {
        Playable[] arr = new Playable[10];
        Random random = new Random();
        for (int i = 0; i <arr.length; i++) {
            int x = random.nextInt(3);
            switch (x) {
                case 0:
                    arr[i] = new Guitar(i + 1);
                    break;
                case 1:
                    arr[i] = new Drumm(i * i);
                    break;
                default:
                    arr[i] = new Trumpet(2 * i);
            }
        }
        for (Playable playable : arr) {
          playable.play();
        }
    }
}
