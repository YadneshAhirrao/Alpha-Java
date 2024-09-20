import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        int str = 111;
        // System.out.println(Solve(str));
        Solve(str);
    }

    public static void Solve(int num) {

        int div = 1;
        while (div < num) {
            div *= 10;
        }

        boolean first = true;
        while (div > 0) {
            int digit = num / div;
            if (digit != 0) {
                if (!first) {
                    System.out.print(" + ");
                }
                System.out.print(digit * div);
                first = false;
            }

            num %= div;
            div /= 10;
        }
        System.out.println();
    }

    // public static String Solve(int num) {
    // StringBuilder sb = new StringBuilder();
    // int i = 1;

    // while (num != 0) {
    // int temp = num % 10;
    // if (temp != 0) {
    // sb.insert(0, "+" + (temp * i));
    // }

    // i *= 10;
    // num /= 10;
    // }

    // return sb.substring(1).toString();
    // }
}
