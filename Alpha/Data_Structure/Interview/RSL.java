import java.util.Arrays;
import java.util.Stack;

/* 
    public static void solve15() {
       
    }

    public static void function14(){
    
    }
*/
public class RSL {
    public static void main(String[] args) {
        solve1();
    }

    /*
     * you have given the binary string find the maximum even number by re arranging
     * binary string you dont alloweed to used any extra space
     */

    public static void solve17() {
        System.out.println(function17("10010110"));
    }

    public static String function17(String str) {
        char[] ch = str.toCharArray();
        int one = 0;
        int zero = 0;
        int idx = 0;
        for (char c : ch) {
            if (c == '1') {
                one++;
            } else if (c == '0') {
                zero++;
            }
        }

        if (zero == 0) {
            return str;
        }

        while (one > 0) {
            ch[idx++] = '1';
            one--;
        }

        while (zero > 0) {
            ch[idx++] = '0';
            zero--;
        }

        return new String(ch);
    }

    /*
     * Array contains only 0 and 1, Write a program that sort this numbers using
     * single loop
     */
    public static void solve16() {
        int[] arr = { 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1 };
        System.out.println(Arrays.toString(arr));
        function16(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void function16(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            if (arr[l] == 0) {
                l++;
            } else if (arr[r] == 1) {
                r--;
            } else {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
    }

    /*
     * reverse whole string not a single word of a string like "I.like" = "like.i"
     */

    public static void solve15() {
        System.out.println(function15_1("I.like.you.so.much"));
    }

    public static String function15_1(String s) {
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        String ans = "";
        while (i >= 0) {
            if (i < 0)
                break;
            int j = i;

            if (ans.isEmpty()) {
                ans = ans.concat(s.substring(i + 1, j + 1));
            } else {
                ans = ans.concat('.' + s.substring(i + 1, j + 1));
            }
        }
        return ans;
    }

    public static String function15(String s) {
        String[] str = s.split("\\.");

        for (int i = 0; i < str.length / 2; i++) {
            String temp = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = temp;
        }
        return String.join(".", str);
    }

    /*
     * find the angle between hr hand and min hand of a clock
     * Note:
     * each hour, the hour hand moves 30 degrees.
     * For every 60 minutes, the hour hand moves 30°
     * each minute, the minute hand moves 6 degrees.
     */
    public static void solve14() {
        System.out.println(function14(9, 15));
    }

    public static double function14(int hours, int min) {
        if (hours >= 12) {
            hours %= 12;
        }

        double hourAngle = (hours * 30) + (min * 0.5);
        double minAngle = min * 6;

        double difference = Math.abs(hourAngle - minAngle);

        return Math.min(difference, 360 - difference);
    }
    /*
     * First Unique Character in a String
     */

    public static void solve13() {
        String str1 = "lleetcode";
        String str2 = "aalloo";
        String str3 = "Hello";
        System.out.println(function13(str1));
        System.out.println(function13(str2));
        System.out.println(function13_1(str1));
        System.out.println(function13_1(str2));

    }

    public static int function13_1(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (i != j && ch[i] == ch[j]) {
                    break;
                }
                if (j == ch.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static int function13(String str) {
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    /* HourGlass Problem */
    public static void solve12() {
        int[][] grid1 = { { 6, 2, 1, 3 }, { 4, 2, 1, 5 }, { 9, 2, 8, 7 }, { 4, 1, 2, 9 } };
        int[][] grid2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(function12(grid1));
        System.out.println(function12(grid2));
    }

    public static int function12(int grid[][]) {
        int n = grid.length;
        int m = grid[0].length;
        int max = 0;

        for (int i = 1; i + 1 < n; i++) {
            for (int j = 1; j + 1 < m; j++) {
                int sum = grid[i - 1][j - 1] + grid[i - 1][j] + grid[i - 1][j + 1] + grid[i][j] + grid[i + 1][j - 1]
                        + grid[i + 1][j] + grid[i + 1][j + 1];
                max = Math.max(max, sum);
            }
        }
        return max;

    }

    /*
     * Given an expression string exp, write a program to examine whether the pairs
     * and the orders of "{", "}", "(", ")", "{", "]" are correct in exp.
     * If the given string is balanced then return the same string.
     * If the given string is unbalanced then balance the string and then return it.
     */
    public static void solve11() {
        System.out.println(function11("{[(a+b)*(c+d)]"));
        System.out.println(function11("{[()]"));
    }

    public static String function11(String exp) {
        Stack<Character> s = new Stack<>();
        StringBuilder balancedExp = new StringBuilder();

        // First, check the balance and construct the initial balanced expression
        for (char ch : exp.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                s.push(ch);
                balancedExp.append(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (!s.isEmpty() && ((ch == ')' && s.peek() == '(') ||
                        (ch == '}' && s.peek() == '{') ||
                        (ch == ']' && s.peek() == '['))) {
                    s.pop();
                } else {
                    // Insert the corresponding opening bracket before the unmatched closing one
                    if (ch == ')')
                        balancedExp.append('(');
                    if (ch == '}')
                        balancedExp.append('{');
                    if (ch == ']')
                        balancedExp.append('[');
                }
                balancedExp.append(ch);
            } else {
                // For other characters, just append to the result
                balancedExp.append(ch);
            }
        }

        // Add any unmatched opening brackets at the end
        while (!s.isEmpty()) {
            char top = s.pop();
            if (top == '(')
                balancedExp.append(')');
            else if (top == '{')
                balancedExp.append('}');
            else if (top == '[')
                balancedExp.append(']');
        }

        return balancedExp.toString();
    }

    /* Function to print a pyramid pattern */
    public static void solve10() {
        function10(5);
    }

    public static void function10(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    /*
     * Write a function that takes a string as input and replace the space with "%?"
     * Input: "welcome to geeksforgeeks"
     * Output: "welcome%?to%?geeksforgeeks"
     */

    public static void solve9() {
        System.out.println(function9("welcome to geeksforgeeks"));
        System.out.println(function9_1("welcome to geeksforgeeks"));
    }

    public static String function9_1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                sb.append("%?");
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String function9(String str) {
        String str2 = str.replace(" ", "%?");
        return str2;
    }

    /*
     * Write a function that takes a string as an input and returns the first
     * non-repeating character.
     */
    public static void solve8() {
        System.out.println(function8("aaabbcddce"));
        System.out.println(function8_1("aaabbcddce"));

    }

    public static char function8_1(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    public static char function8(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    /*
     * Write a function that takes two inputs, year, and n and returns n leap year
     * after the given year.
     * 
     * Note:
     * First checking if the year is a leap year in the general case (divisible by 4
     * but not 100).
     * Then checking the exception case where a year divisible by 100 is still a
     * leap year if it is also divisible by 400.
     */

    public static void solve7() {
        function7(2000, 5);
        function7(2016, 3);
    }

    public static void function7(int year, int num) {
        int i = 0;
        year++;
        while (i < num) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("leap Year: " + year);
                i++;
            }
            year++;
        }
    }

    /*
     * Write a function that takes an integer as an input and returns the nearest
     * prime number.
     */
    public static void solve6() {
        System.out.println(function6(12));
        System.out.println(function6(15));
    }

    public static int function6(int n) {
        if (n <= 2)
            return 2;
        int lower = n;
        int upper = n;

        while (true) {
            if (isPrime(lower)) {
                return lower;
            }
            if (isPrime(upper)) {
                return upper;
            }

            lower--;
            upper++;
        }

    }

    public static boolean isPrime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * Write a function that takes an array of integers and prints the numbers that
     * have a remainder of 4 when divided by 5.
     * Input: [19,10,44,3,11,129]
     * Output: [19, 44, 129]
     * Input:[13,4]
     * Output: [4]
     */
    public static void solve5() {
        int arr[] = { 19, 10, 44, 3, 11, 129 };
        int brr[] = { 13, 4 };
        function5(arr);
        function5(brr);
    }

    public static void function5(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 5 == 4) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    /*
     * Write a function that takes an array of integers as input and prints the
     * second maximum difference between any two elements from an array.
     * Input: arr[] = {14,12,70,95,65,22,30};
     * Output: 81
     * [1st max difference = 95-12=83
     * 2nd max difference = 95-14 = 81]
     */
    public static void solve4() {
        int arr[] = { 14, 12, 70, 95, 65, 22, 30 };
        System.out.println(function4(arr));
    }

    public static int function4(int[] arr) {
        int max = arr[0];
        int small = arr[0];
        int secondsmall = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < small) {
                secondsmall = small;
                small = arr[i];
            }

            if (arr[i] < secondsmall && arr[i] > small) {
                secondsmall = arr[i];
            }
        }

        return max - secondsmall;
    }

    /*
     * Write a function that takes a string as an input and you have to return the
     * frequency of characters
     * OR
     * For "aabcccccaaa" input, your method will return "a2b1c5a3" but for abcd
     * input, your method will return "abcd"
     */
    public static void solve3() {
        function3("aabcccccaaa");
        System.out.println(function3_1("aabcccccaaa"));
    }

    public static String function3_1(String str) {
        int countConsecutive = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            countConsecutive++;
            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                sb.append(str.charAt(i));
                sb.append(countConsecutive);
                countConsecutive = 0;
            }
        }
        return sb.length() < str.length() ? sb.toString() : str;
    }

    public static void function3(String str) {
        int[] freq = new int[26];

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + freq[i]);
            }
        }
    }

    /*
     * Write a function that takes a number as input if the given number is a
     * Fibonacci number, prints the number otherwise, print the sum of all even
     * Fibonacci numbers less than the given number.
     * Input: 20
     * Output: 10
     * Input: 21
     * Output: 21
     */

    public static void solve2() {
        System.out.println(function2(20));
        System.out.println(function2(100));
    }

    public static int function2(int n) {
        int sum = 0;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0, b = 1;
        while (b < n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b == n ? b : sum;

    }

    /*
     * Write a function that takes an input parameter as a string and return the
     * alternate words in it with "abc". Words are separated by dots.
     * Input: "i.like.this.program.very.much"
     * Output: "i.abc.this.abc.very.abc"
     */
    public static void solve1() {
        System.out.println(function1("i.like.this.program.very.much"));
        System.out.println(function1_1("i.like.this.program.very.much"));
    }

    public static String function1(String str) {
        String[] words = str.split("\\.");
        for (int i = 1; i < words.length; i += 2) {
            words[i] = "abc";
        }

        return String.join(".", words);
    }

    public static String function1_1(String str) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();
        int wordIndex = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '.') {
                if (wordIndex % 2 == 1) {
                    result.append("abc");
                } else {
                    result.append(word);
                }
                result.append('.');
                word.setLength(0);
                wordIndex++;
            } else {
                word.append(ch);
            }
        }

        if (wordIndex % 2 == 1) {
            result.append("abc");
        } else {
            result.append(word);
        }
        return result.toString();
    }
}