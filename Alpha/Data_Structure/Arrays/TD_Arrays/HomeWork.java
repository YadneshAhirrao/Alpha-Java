package Alpha.Data_Structure.Arrays.TD_Arrays;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int arr[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        System.out.println(Q1(arr, 7));

        int brr[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        System.out.println(Q2(brr, 1));

        int crr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        Q3(crr);

    }

    public static int Q1(int arr[][], int num) {
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == num) {
                    ct++;
                }
            }
        }
        return ct;
    }

    public static int Q2(int arr[][], int num) {
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == num) {
                    ct += arr[i][j];
                }
            }
        }
        return ct;
    }

    public static void Q3(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;
        int transpose[][] = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(transpose));
        // return transpose;
        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
        for (int[] a : transpose) {
            System.out.println(Arrays.toString(a));
        }
    }
}
