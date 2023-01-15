package LessonCollections;

public class LinkedListApp {
    public static void main(String[] args) {
        CustomLintedList<Integer> customLintedList = new CustomLintedList<>();
        customLintedList.Add(1);
      /*  customLintedList.Add(3);
        customLintedList.Add(4);
        customLintedList.Add(5);
        System.out.println(customLintedList.get(3));*/
        customLintedList.add(0,2);
        customLintedList.print();
    }
}
