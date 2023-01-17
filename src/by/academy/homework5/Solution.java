package by.academy.homework5;

import java.io.IOException;
import java.util.Scanner;

public class Solution {

    static class DoublyLinkedListNode {
        public int data;
        public DoublyLinkedListNode next;
        public DoublyLinkedListNode prev;

        public DoublyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
            this.prev = null;
        }
    }

    static class DoublyLinkedList {
        public DoublyLinkedListNode head;
        public DoublyLinkedListNode tail;

        public DoublyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            DoublyLinkedListNode node = new DoublyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
                node.prev = this.tail;
            }

            this.tail = node;
        }
    }

    public static void printDoublyLinkedList(DoublyLinkedListNode node, String sep) throws IOException {
        while (node != null) {
            System.out.print(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedList { int data; DoublyLinkedListNode next;
     * DoublyLinkedListNode prev; }
     *
     */
    public static DoublyLinkedListNode reverse(DoublyLinkedList list) {
        //исходя из кода печати там была печать с начала... и логично вернуть head
      if (list.head == null) {
          return null;
      }
        DoublyLinkedListNode tailNode = list.tail;
        DoublyLinkedListNode loopTail = list.tail;
        while ( loopTail.prev != null ) { //идем с хвоста
           DoublyLinkedListNode temp = loopTail.prev;
           loopTail.prev = loopTail.next;
           loopTail.next = temp;
           loopTail = temp;
        }
       DoublyLinkedListNode temp = loopTail.prev;
      loopTail.prev = loopTail.next;
      loopTail.next = temp;
      //loopTail = temp;
      list.tail = loopTail;
      list.head = tailNode;
      return  list.head;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        DoublyLinkedList llist = new DoublyLinkedList();

        int llistCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < llistCount; i++) {
            int llistItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            llist.insertNode(llistItem);
        }
        printDoublyLinkedList(llist.head,";");
        System.out.println();

        DoublyLinkedListNode llist1 = reverse(llist);
        llist1 = reverse(llist);
        printDoublyLinkedList(llist1, " ");
        System.out.println();
        scanner.close();
    }
}
