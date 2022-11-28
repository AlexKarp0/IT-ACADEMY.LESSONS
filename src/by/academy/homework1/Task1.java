package by.academy.homework1;

import java.util.Scanner;

public class Task1 {
    public static int getRange(double price){
        if (price >= 400){
            return 4;
        } else if (price >= 300) {
            return 3;
        } else if (price >= 200) {
            return 2;
        } else if (price >= 100) {
            return  1;
        } else return  0;
    }
    public static void main(String[] args) {
        double[] salepPercentArray = {0.05,0.07,0.12,0.15,0.2};
        double startPrice =  0;
        int age = 0;
        double finishPrice = startPrice;
        double salePercent = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter price");
        if (sc.hasNextDouble()){
            startPrice = sc.nextDouble();
        }
        System.out.println("Get Age");
        if (sc.hasNextInt()){
            age = sc.nextInt();
        }
        salePercent = salepPercentArray[getRange(startPrice)];
        if (getRange(startPrice) == 2) {
            double extraSale = age > 18 ? 0.04 : -0.03;
            salePercent += extraSale;
        }
        finishPrice = startPrice * (1 - salePercent);
        System.out.println(getRange(startPrice));
        System.out.println("Finish price is " +  finishPrice);
        sc.close();
    }
}
