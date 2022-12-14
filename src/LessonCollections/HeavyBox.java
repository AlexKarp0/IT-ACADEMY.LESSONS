package LessonCollections;

public class HeavyBox {
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
}
