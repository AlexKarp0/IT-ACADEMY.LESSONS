package by.academy.homework1;

public class Task4 {
    public static void main(String[] args) {
        int number= 1_000_000;
        for (int i = 1; i < number << 1; i = i << 1){
            System.out.print(i + " ");
        }
    }
}
