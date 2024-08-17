import java.util.*;

public class Questions {

    public static void pushAtBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);

    }

    public static void stockSpan(int stock[], int span[]) {
        Stack<Integer> s = new Stack<>();
        span[0] = 1;
        s.push(0);

        for (int i = 1; i < stock.length; i++) {
            int curr = stock[i];

            while (!s.isEmpty() && curr > stock[s.peek()]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                int prev = s.peek();
                span[i] = i - prev;
            }

            s.push(i);
        }

    }

    public static int[] nextGreater(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int[] nextGreat = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.empty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreat[i] = -1;
            } else {
                nextGreat[i] = arr[s.peek()];
            }
            s.push(i);
        }

        return nextGreat;
    }

    public static boolean dublicatePar(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == ')') {
                int ct = 0;
                while (s.peek() != '(') {
                    s.pop();
                    ct++;
                }
                if (ct < 1) {
                    return true;
                } else {
                    s.pop();
                }

            } else {
                s.push(ch);
            }
        }

        return false;
    }

    public static 

    public static void main(String[] args) {
        String str = "((a+b+c))";
        System.out.println(dublicatePar(str));
    }

}
