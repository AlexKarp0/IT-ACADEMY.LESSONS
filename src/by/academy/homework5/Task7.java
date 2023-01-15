////Задача 7.
////        Дан указатель на последний элемент двусвязного списка(tail). Head/tail может быть null, это говорит о том, что список пуст, возвращаем null.
////        Поменять порядок элементов в списке на обратный. Измените следующий(next) и предыдущий (prev) указатели всех узлов,
////        чтобы направление списка изменилось. Вернуть список на последний элемент измененного(перевернутого) списка.
////        Описание:
////        Закончите функцию ниже, которая изменит порядок списка на обратный. Функция принимает следующие параметры:
////        head – указатель на последний элемент списка в DoublyLinkedList
////        Формат ввода:
////        Первая линия принимает integer t – количество элементов в списке
////        Следующие n линий – представляют собой элементы двусвязного списка.
////        Ограничения:
////        0 <= n <= 1000
////        0 <= DoubleLinkedListNode.data <= 1000
////        Формат вывода:
////        Должен вернуться указатель на последний элемент перевернутого списка.
////        Пример ввода:
////        4
////        1
////        2
////        3
////        4
////        Пример вывода:
////        4 3 2 1
////
//
//package by.academy.homework5;
//
//import java.io.IOException;
//import java.util.Scanner;
//
//public class Task7 {
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter size");
//        Solution.DoublyLinkedList doublyLinkedList = new Solution.DoublyLinkedList();
//        int size = scanner.nextInt();
//            for (int i = 0; i < size; i++) {
//                    doublyLinkedList.insertNode(scanner.nextInt());
//            }
//            try{
//            Solution.printDoublyLinkedList(doublyLinkedList.head,"||");}
//            catch (IOException e)
//            {
//                    System.out.println("got exception");
//            }
//    }
//}
