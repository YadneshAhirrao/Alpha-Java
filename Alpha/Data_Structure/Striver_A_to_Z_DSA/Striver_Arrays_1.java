import java.util.Arrays;

public class Striver_Arrays_1 {
    public static void main(String[] args) {
        // int arr[] = { 3, 2, 1, 5, 4, 6 };
        int arr[] = { 1, 1, 2, 2, 2, 3, 3, 3 };
        System.out.println(Arrays.toString(arr));
        // Arrays.sort(arr);
        // System.out.println(CheckSorted(arr));
        // System.out.println(LargestElement(arr));
        // System.out.println(SecondLargest_1(arr));
        // System.out.println(SecondLargest_2(arr));
        System.out.println(RemoveDublicate(arr));
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
    public static int SecondLargest_1(int[] arr) {
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < arr.length - 1 - i; j++) {
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

    public static int SecondLargest_2(int[] arr) {
        int larger = arr[0];
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larger) {
                second = larger;
                larger = arr[i];
            }
        }

        return second;
    }

    // 1.3 check if array is sorted
    public static int CheckSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1])
                return 0;
        }
        return 1;
    }

    // 1.4 Remove Dublicate from Sorted Array

    public static int RemoveDublicate(int[] arr) {
        int a = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[a] != arr[i]) {
                arr[a + 1] = arr[i];
                a++;
             }
        }
        return a + 1;
    }
}
