package lesson4;

public class CyclesTask19 {
    public static void main(String[] args) {
        for (int i = 10; i < 100; ++i){
            for (int j = 10; j < 100; ++j){
                int digit4 = i * 100 + j;
                if (digit4 % (i * j ) == 0){
                    System.out.println("i = " + i + " j= " + j);
                }
            }
        }
    }
}
