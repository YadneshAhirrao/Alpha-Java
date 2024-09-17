public class LinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public Node findIntersection(Node head1, Node head2) {
        Node temp = new Node(0);
        Node tail = temp;

        while (head1 != null && head2 != null) {
            if (head1.data == head2.data) {
                tail.next = new Node(head1.data);
                tail = tail.next;
                head1 = head1.next;
                head2 = head2.next;
            } else if (head1.data < head2.data) {
                head1 = head1.next;
            } else {
                head2 = head2.next;
            }
        }

        return temp.next;
    }

    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.insert(1);
        l1.insert(2);
        l1.insert(3);
        l1.insert(4);
        l1.insert(6);

        LinkedList l2 = new LinkedList();
        l2.insert(2);
        l2.insert(4);
        l2.insert(6);
        l2.insert(8);

        LinkedList ll = new LinkedList();

        ll = findIntersection(l1, l2);
        System.out.print("Intersection of list1 and list2: ");
        ll.printList();
    }

}
