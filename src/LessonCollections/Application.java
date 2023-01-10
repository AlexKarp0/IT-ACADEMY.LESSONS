package LessonCollections;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        ArrayList<HeavyBox> heavyBoxes = new ArrayList<>();
        heavyBoxes.add(new HeavyBox(999,999,999,999));
        HeavyBox newHB = new HeavyBox(2,2,2,2);
        heavyBoxes.add(newHB);//1
        heavyBoxes.add(newHB);//2

        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);

        }
        HeavyBox hb =  heavyBoxes.get(0);
        hb.weight = 1;
        heavyBoxes.set(0,hb);
        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);

        }
        System.out.println("after delete");
        heavyBoxes.remove(heavyBoxes.size()-1);

        for (HeavyBox heavyBox : heavyBoxes) {
            System.out.println(heavyBox);
        }
        System.out.println(heavyBoxes);

        System.out.println("to arrays");
        HeavyBox[] arr = (HeavyBox[]) heavyBoxes.toArray();
        System.out.println(Arrays.toString(arr));
    }
}
