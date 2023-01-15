package LessonCollections;

import java.util.Objects;
import  java.lang.Comparable;

public class HeavyBox  implements Comparable<HeavyBox> {
    int weight;
    int width;
    int height;
    int depth;

    public HeavyBox(int weight, int width, int height, int depth) {
        this.weight = weight;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }


    @Override
    public String toString() {
        return "HeavyBox{" +
                "weight=" + weight +
                ", width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HeavyBox heavyBox = (HeavyBox) o;
        return weight == heavyBox.weight && width == heavyBox.width && height == heavyBox.height && depth == heavyBox.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, width, height, depth);
    }
    @Override
    public int compareTo(HeavyBox anotherBox) {
        return this.weight - anotherBox.weight;
    }
}
