package lesson3;

public class Task4 {
    public static void main(String[] args) {
        int number = 3;
        switch (number % 2){
            case 0:
                System.out.println("ODD");
                break;
            default:
                System.out.println("NOT ODD");
        }
    }
}
