package Alpha.Revision;
// Questions Done Here

/*
 * Binary to decimal
 */

import java.util.Arrays;

public class FirstCode {
    public static void main(String[] args) {
        // String str = "10011010010";
        // binaryToDecimal(str);

        int[] arr = { 4, 5, 6, 7, 12, 45, 67, 89, 121 };
        int num = 129;

        // decimalToBinary(num);
        pattern9(5);
        // binarySearchCode(arr, 671);
        // reverseTheArray(arr);
    }

    public static void pattern9(int num) {
        // int space = 2 * (num - 1);
        for (int i = 1; i <= num; i++) {
            // num
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }

            // num
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
            // space -= 2;
        }
        // int space1 = 2 * (num - 1);
        for (int i = num; i > 0; i--) {
            // num
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }

            // num
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void reverseTheArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void binarySearchCode(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                System.out.println("The Number present at " + (mid + 1) + " index");
                System.exit(0);
            }

            if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        System.out.println("Error");
    }

    // Approch 1

    public static void binaryToDecimal1(String str) {
        long ans = 0;
        int ct = 0;
        long number = Integer.parseInt(str);

        while (number > 0) {
            long rem = number % 10;
            ans = ans + rem * (int) Math.pow(2, ct);
            number = number / 10;
            ct++;
        }

        System.out.println(ans);
    }

    // Approch 2nd

    public static void binaryToDecimal2(String str) {
        int ans = 0;
        int ct = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            int num = str.charAt(i) - '0';
            ans += num * (int) Math.pow(2, ct);
            ct++;
        }

        System.out.println(ans);
    }

    public static void decimalToBinary(int num) {
        // use String Builder
        long ans = 0;
        int ct = 0;

        while (num > 0) {
            int rem = num % 2;
            ans = ans + (rem * (int) Math.pow(10, ct));
            ct++;
            num = num / 2;
        }

        System.out.println(ans);
    }

    public static void pattern1(int num) {

        for (int r = 1; r <= num; r++) {
            int ct = r % 2 == 0 ? 0 : 1;
            for (int c = 1; c <= r; c++) {
                System.out.print(ct + " ");
                ct = 1 - ct;
            }
            System.out.println();
        }
    }

    public static void pattern2(int num) {

        for (int i = 1; i <= 2 * num - 1; i++) {
            int star = i;
            if (i > num)
                star = 2 * num - i;
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }
    }

    public static void pattern3(int num) {
        int space = 2 * (num - 1);

        for (int i = 1; i <= num; i++) {
            // num
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            space -= 2;
        }
    }

    public static void pattern4(int num) {
        for (int i = 0; i < num; i++) {
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch + " ");
                if (j <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            for (int j = 0; j < num - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int num) {

        for (int i = 0; i < num; i++) {

            for (char ch = (char) ((int) 'E' - i); ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int num) {
        int row = 5;
        int col = 3;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern7(int num) {
        for (int i = 1; i <= num; i++) {

            // space
            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }

            // num
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

        for (int i = num - 1; i > 0; i--) {
            for (int j = num - i; j > 0; j--) {
                System.out.print("  ");
            }

            // num
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }

    }

    public static void pattern8(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

}