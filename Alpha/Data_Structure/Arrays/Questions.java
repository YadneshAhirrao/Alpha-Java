

import java.util.Arrays;

public class Questions {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3 };
        System.out.println(Arrays.toString(plusOne(arr)));
        // plusOne(arr);
    }

    public static int[] plusOne(int[] arr) {
        int sum = 0;
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum * 10 + arr[i];
            ct++;
        }
        sum = sum + 1;
        int num = ct;
        int brr[] = new int[num];
        int i = 0;
        while (sum > 0) {
            int temp = sum % 10;
            brr[i] = temp;
            sum = sum / 10;
            i++;
        }

        int n = brr.length;
        int d, t;
        for (d = 0; d < n / 2; d++) {
            t = brr[d];
            brr[d] = brr[n - d - 1];
            brr[n - d - 1] = t;
        }

        return brr;
    }

}
