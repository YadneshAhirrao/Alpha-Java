import java.util.Arrays;

public class BacktrackingBasics {
    static int count = 0;

    public static void main(String[] args) {

        // int[] arr = {1, 2, 3, 4, 5, 6};
        // changeArray(arr, 0, 1);
        // System.out.println(Arrays.toString(arr));

        // String str = "abc";
        // findSubset(str, new String(""), 0);

        String str = "abcde";
        findPermutation(str, "");
        // System.out.println(str.substring(5));
        // System.out.println(str.substring(0,2));
        System.out.println(count);

    }

    // Find the permutation of the given string
    public static void findPermutation(String str, String ans) {
        // Base Case
        if (str.length() == 0) {
            System.out.print(ans + " ");
            count++;
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }

    // Find the subset of the given string
    public static void findSubset(String str, String ans, int i) {
        if (i == str.length()) {
            System.out.print(ans + " ");
            return;
        }

        findSubset(str, ans + str.charAt(i), i + 1);
        findSubset(str, ans, i + 1);
    }

    public static void changeArray(int[] arr, int i, int val) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = val; // Going up in stack
        changeArray(arr, i + 1, val + 1); // Recursion function
        arr[i] = arr[i] - 2; // Going Down in call stack and Backtracking code
    }
}
