package Alpha.Revision;

import java.util.Arrays;

public class ArraysRevision {
    public static void main(String[] args) {
        // int []arr = new int[10];
        // int[] arr = { 12, 13, 14, 16, 23, 34, 45, 56 };
        int arr[] = { 2, 4, 6, 8, 10 };
        // int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };

        // System.out.println(binarySearch(arr, 1));
        // printPairArray(arr);
        // printSubArray(arr);
        // printMaxSumArr(arr);
        RotateArray(arr, 3);
    }

    public static void RotateArray(int[] nums, int k) {
        int temp = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i + 1] = nums[i];
        }
        nums[0] = temp;
        System.out.println(Arrays.toString(nums));
    }

    public static void printMaxSumArr(int arr[]) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }

    public static void printSubArray(int[] arr) {
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");

                }
                System.out.println();
                ct++;
            }
            System.out.println();
        }
        System.out.println(ct);
    }

    // Make the pair of array
    public static void printPairArray(int[] arr) {
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")" + " ");
                ct++;
            }
            System.out.println();
        }

        System.out.println(ct);
    }

    // binary Search Alorithm
    public static int binarySearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid + 1;
            }

            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
