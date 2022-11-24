package lesson4;

public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[99 / 2  + 1];
        for (int i = 0; i * 2 <= 99; ++i) {
            a[i] = (i << 1) + 1;
        }
        for (int i = 0; i < a.length; ++i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = a.length - 1; i >= 0; --i) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}
