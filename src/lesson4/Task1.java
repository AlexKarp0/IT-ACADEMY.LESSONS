package lesson4;

public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 1; i * 2  <= 20; ++i) {
            array[i - 1] = i * 2;
        }
        for (int i = 0; i < array.length; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
