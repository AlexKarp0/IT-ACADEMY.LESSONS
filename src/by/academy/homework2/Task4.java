package by.academy.homework2;
//Diamonds (Бубы / Алмазы)
//Hearts (Черви / Сердца)
//Clubs (Трефы / Клубы)
//Spades (Пики / Лопаты)
//Напишите программу Deal.java, которая должна имитировать раздачу карт для игры в покер.
//Программа получает число n, задаваемое с консоли пользователем, и раздает карты на n  игроков (по 5 карт каждому) из рассортированной колоды.
//Разделяйте пять карт, выданных каждому игроку, пустой строкой.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String[] suit = {"Diamonds","Hearts","Clubs","Spades"};
        String[] nominals = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        String[] cardDeck = new String[52];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i <suit.length ; i++) {
            for (int j = 0; j < nominals.length ; j++) {
                Random rn = new Random();
                int index = rn.nextInt(52);
                while (cardDeck[index] != null){
                    index = rn.nextInt(52);
                }
                cardDeck[index] = nominals[j] + " of " + suit[i];
                //System.out.println(cardDeck[index]);
            }

        }
        System.out.println("Enter numbers of Players");
        int n = scanner.nextInt();
        String[][] playerCard= new String[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                playerCard[i][j] = cardDeck[i * 5 + j];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Card player number " + (i+1) + ": ");
            System.out.println(Arrays.deepToString(playerCard[i]));
            System.out.println();

        }
       // System.out.println(Arrays.deepToString(cardDeck));
    }

}
