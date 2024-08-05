import java.util.*;

public class StackCollection {
    public static void main(String[] args) {
        // Stack<Integer> s = new Stack<>();

        // s.push(12);
        // s.push(11);
        // s.push(10);
        // s.push(19);

        // System.out.println(s.firstElement());
        // pushBottom(s, 100);
        // System.out.println(s.firstElement());

        String str = "ABC";
        String result = reverseString(str);

        System.out.println(result);
    }

    

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;

        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();

            sb.append(curr);
        }

        return sb.toString();
    }

    public static void pushBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
}
