package Alpha.Data_Structure.LinkedList;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) {
        // step: 1 -> create a new Node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step:2 -> newNode next to head
        newNode.next = head;

        // step:3 -> head = newNode
        head = newNode;
    }

    public void addLast(int data) {
        // step: 1 -> create a node
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step: 2 -> tail's next = newNode
        tail.next = newNode;

        // step: 3 -> tail = newNode
        tail = newNode;
    }

    public void printLinkedlist() {

        if (head == null) {
            System.out.println("It is a empty linkedList");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void addMid(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        ll.addFirst(2);
        ll.printLinkedlist();
        ll.addFirst(1);
        ll.printLinkedlist();
        ll.addLast(3);
        ll.printLinkedlist();
        ll.addLast(4);
        ll.printLinkedlist();
        ll.addMid(2, 9);
        ll.printLinkedlist();
    }
}
