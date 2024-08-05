public class Revision {

    public static class Stack {
        static int[] arr = new int[10];
        static int length = 0;

        public static int push(int a) {
            if (length < 10) {
                arr[length] = a;
                length++;
                return a;
            }
            return -1;
        }

        public static int pop() {
            if (length >= 0) {
                int a = arr[length - 1];
                arr[length - 1] = 0;
                length--;
                return a;
            }
            return -1;
        }

        public static void print() {
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(arr[i]+" ");
            }
        }

        public static int peek() {
            return arr[length-1];
        }

        
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        System.out.println(s.push(10));
        System.out.println(s.push(20));
        System.out.println(s.push(50));
        System.out.println(s.push(70));

        System.out.println(s.pop());


        s.print();
    }

}
