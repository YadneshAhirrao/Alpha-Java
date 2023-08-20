package Alpha.Data_Structure.Striver_A_to_Z_DSA;

import java.util.Arrays;

public class Striver_Arrays_1 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 4, 6 };
        System.out.println(LargestElement(arr));
        System.out.println(SecondLargest(arr));
    }

    // 1.1 Find the largest element in the array
    public static int LargestElement(int[] arr) {
        int larger = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larger) {
                larger = arr[i];
            }
        }
        return larger;
    }

    // 1.2 Find the second largest element in an array
    public static int SecondLargest(int[] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));
        return arr[arr.length - 2];
    }

}
