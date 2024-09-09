public class Revision {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addMid(int idx, int data) {
        Node newNode = new Node(data);
        Node temp = head;
        int ct = 0;

        while (ct < idx - 1) {
            temp = temp.next;
            ct++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void printll() {
        if (head == null) {
            System.out.println("Linkedlist is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        MySection ll = new MySection();

        // ll.addFirst(3);
        // printll();
        // ll.addFirst(6);
        // printll();
        // ll.addLast(4);
        // printll();
        // ll.addLast(23);
        // printll();
        // ll.addMid(2, 99);
        // ll.printll();

    }
}
