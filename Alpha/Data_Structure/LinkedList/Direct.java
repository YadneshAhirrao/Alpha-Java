import java.util.LinkedList;

public class Direct {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        System.out.println(ll);
        System.out.println(ll.contains(1));
        ll.add(2, 20);
        System.out.println(ll.get(2));
        ll.removeFirst();
        System.out.println(ll);

    }
}
