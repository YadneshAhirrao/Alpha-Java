
import java.util.ArrayList;

public class Basics {

    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int data) {
            list.add(data);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            return list.get(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(12);
        s.push(13);
        s.push(111);
        // System.out.println(s.pop());

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
    }
}
