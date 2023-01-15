package by.academy.homework5;

public class Task6 {
    public static void main(String[] args) {
        int[] a = new int[8];
        a[0] = 1;
        try{
          a[10] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is to small, expand the array");
        }
        finally {
            System.out.println("FINALLY");
        }
    }
}
