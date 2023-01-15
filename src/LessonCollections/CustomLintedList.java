package LessonCollections;

public class CustomLintedList<T> {
    private Node head;
    private Node tail;
    private int size = 0;

    public void Add(T value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }
    private Node getNode(int index){
        if (index >= size){
            return null;
        }
        int counter = 0;
        Node currNode = head;
        while (counter < index || index < 0){
            counter++;
            currNode = currNode.next;
        }
        return currNode;
    }
    public void add (int index, T value){
        System.out.println("size is " + size);
        if (index < 0 || index > size ){
            System.out.println("Index of bound exception");
            return;
        }
        Node newNode = new Node(value);
        if (index == 0){
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            size++;
            return;
        } else if (index == size) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
            return;
        }

        Node node1 = this.getNode(index-1);
        Node node2 = node1.next;
        node1.next = newNode;
        node2.prev = newNode;
        newNode.prev = node1;
        newNode.next = node2;
        size++;
    }
    public T get(int index) {
        if (index >= size){
            return null;
        }
        int counter = 0;
        Node currNode = head;
        while (counter < index || index < 0){
             counter++;
            currNode = currNode.next;
        }
        return currNode.value;
    }
    public void print()
    {
        Node currNode = head;
        while (currNode != null){
            System.out.print("<" + currNode.value + ">");
            currNode = currNode.next;
        }
    }
    class Node {
        T value;
        Node prev;
        Node next;

        public Node(T value) {
            super();
            this.value = value;
        }
    }
}
