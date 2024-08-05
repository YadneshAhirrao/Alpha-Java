public class Practice {

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
    public static int size;

    public static void main(String[] args) {
        Practice list = new Practice();

        list.addFirst(12);
        list.addLast(1);
        list.addLast(3);
        list.addLast(6);
        list.addLast(5);
        list.printList();
        deleteFromEnd(3);
        list.printList();
    }

    public static void addMid(int idx, int data) {
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int ct = 0;
        while (ct < idx - 1) {
            temp = temp.next;
            ct++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static int deleteLast() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        Node prev = head;
        while (prev.next.next != null) {
            prev = prev.next;
        }

        int val = prev.next.data;
        prev.next = null;
        size--;
        tail = prev;

        return val;
    }

    public static int deleteFirst() {
        if (size == 0) {
            System.out.println("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void printList() {
        if (head == null) {
            System.out.println("LinkedList is Empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void ReverseList(){
        Node prev = null;
        Node curr = tail = head ;
        Node next;

        while (curr.next != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void deleteFromEnd(int n) {
        Node temp = head;
        int ct = 0;

        while (temp != null) {
            temp = temp.next;
            ct++;
        }

        if (n == ct) {
            head = head.next;
        }

        int i = 1;
        int iToFind = ct - n;
        Node prev = head;

        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

}
