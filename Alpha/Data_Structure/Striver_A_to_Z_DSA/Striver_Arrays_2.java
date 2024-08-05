import java.util.*;

public class Striver_Arrays_2 {
    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        // rotateArrayByD(arr, 3);
        // System.out.println(Arrays.toString(arr));
        // rotateArrayByL(arr, 3);
        // rotateArrayByR(arr, 3);
        // System.out.println(Arrays.toString(arr));

        // int arr[] = { 1, 0, 2, 3, 2, 0, 0, 4, 5, 1 };
        // moveTheZeros(arr);

        // int arr[] = { 1, 2, 2, 3, 1, 5 };
        // int brr[] = { 2, 3, 4, 4, 6, 1, 9 };
        // unionApproch1(arr, brr);
        // intersectionArray(arr,brr);

        // int[] arr = { 1, 1, 0, 1, 1, 1 };
        // System.out.println(findMaxConsecutiveOnes(arr));

        int arr[] = { 1, 2, 3, 1, 1, 1, 1, 3, 3 };
        longSumArray(arr,6);
    }

    // 3.2 Longest Sub array sum k

    public static void longSumArray(int[] arr, int k) {
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxlen = 0;

        while (right < arr.length) {

            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            

            if (sum == k) {
                
                maxlen = Math.max(maxlen, right - left + 1);
            }


            right++;
            if (right < arr.length) {
                sum += arr[right];
            }
        }
        System.out.println(maxlen);
    }

    // LeetCode : 485. Max Consecutive Ones

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
                ans = Math.max(ans, count);
            }
        }

        return ans;
    }

    // 2.5 Intersection of two array

    public static void intersectionArray(int[] arr, int brr[]) {
        int i = 0;
        int j = 0;

        ArrayList<Integer> list = new ArrayList<>();

        while (i < arr.length && j < brr.length) {
            if (arr[i] < brr[j]) {
                i++;
            } else if (brr[j] < arr[i]) {
                j++;
            } else {
                list.add(arr[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);
    }

    // 2.4 Union of two array

    public static void unionApproch1(int[] arr, int brr[]) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int i = 0; i < brr.length; i++) {
            set.add(brr[i]);
        }

        for (int i : set) {
            list.add(i);
        }
        System.out.println(list);
    }

    // 2.3 Move the zeroes to the end

    public static void moveTheZeros(int[] arr) {
        int j = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 2.2 Right Rotate an array by d places

    public static void rotateArrayByR(int[] arr, int d) {
        d = d % arr.length;
        // System.out.println(d);
        int n = arr.length;
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
    }

    // 2.1 Left Rotate an array by d places

    public static void rotateArrayByL(int[] arr, int d) {
        int n = arr.length;
        reverseArray(arr, 0, d - 1);
        reverseArray(arr, d, n - 1);
        reverseArray(arr, 0, n - 1);
    }

    // Helper : Rotate the array

    public static void reverseArray(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
