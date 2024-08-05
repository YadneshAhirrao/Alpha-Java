public class LinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public static int size;

    public void addFirst(int data) {
        // step: 1 -> create a new Node
        Node newNode = new Node(data);
        size++;
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
        size++;
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
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int deleteFirst() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int deleteLast() {
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
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

    public int Searchll(int target) {
        Node temp = head;
        int ct = 0;
        while (temp != null) {
            if (temp.data == target) {
                return ct;
            }
            temp = temp.next;
            ct++;
        }

        return -1;
    }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);

        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public void Reversell() {
        Node prev = null;
        Node curr = tail = head; // priority right to left
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteFromEnd(int n) {
        // Calculate the size
        Node temp = head;
        int ct = 0;
        while (temp != null) {
            temp = temp.next;
            ct++;
        }

        if (n == ct) {
            head = head.next; // similar to delete first
            return;
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

    // Slow - Fast Approch
    public Node findMid(Node head) { // helper Functions
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2

        }

        return slow; // Slow is our mid Node
    }

    public boolean checkPalindrome() {

        if (head == null || head.next != null) {
            return true;
        }

        // step 1: Find the Mid

        Node midNode = findMid(head);
        // step 2: Reverse 2nd half

        Node prev = null;
        Node curr = midNode; // priority right to left
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step 3: Check left half and right half

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }

        return true;
    }

    public Boolean isCycle() {
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }
        return cycle;
    }

    public void removeCycle() {
        Node slow = head;
        Node fast = head;
        Boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }
        Node prev = null;
        slow = head;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public void zigZagLinkedList() {
        // Find the Mid part of linkedlist
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow;

        // reverse the 2nd half of the linkedlist

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        // ll.head = new Node(1);
        // ll.head.next = new Node(2);

        // ll.addFirst(2);
        // ll.printLinkedlist();
        // ll.addFirst(1);
        // ll.printLinkedlist();
        // ll.addLast(3);
        // ll.printLinkedlist();
        // ll.addLast(4);
        // ll.printLinkedlist();
        // ll.addMid(2, 9);
        // ll.printLinkedlist();
        // System.out.println(ll.size);
        // ll.deleteFirst();
        // ll.printLinkedlist();
        // System.out.println(ll.size);
        // ll.deleteLast();
        // ll.printLinkedlist();
        // System.out.println(ll.size);
        // System.out.println(Searchll(4));
        // System.out.println(recSearch(91));
        // Reversell();
        // ll.printLinkedlist();
        // ll.deleteFromEnd(2);
        // ll.printLinkedlist();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.addFirst(6);

        ll.printLinkedlist();
        ll.head = ll.mergeSort(ll.head);
        ll.zigZagLinkedList();
        ll.printLinkedlist();

    }
}
