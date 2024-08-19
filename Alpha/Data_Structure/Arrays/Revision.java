import java.util.Arrays;

public class Revision {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        int[] brr = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0 };
        int[] crr = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int[] drr = {7, 1, 5, 3, 6, 4};
        solve1(arr, 3);
        solve2(arr, 3);
        solve3(arr, 5);
        solve4(brr);
        solve5(crr);
        solve6(drr);
    }

    // Buy and Sell Stock
    public static void solve6(int[] arr) {
        int buy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < arr.length; i++) {
            if (buy < arr[i]) {
                int profit = arr[i] - buy;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buy = arr[i];
            }
        }
        System.out.println(maxProfit);
    }

    // Kadance Algorithm
    public static void solve5(int arr[]) {
        int max = Integer.MIN_VALUE;
        int currsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currsum += arr[i];

            if (currsum < 0) {
                currsum = 0;
            }
            max = Math.max(max, currsum);
        }
        System.out.println(max);
    }

    // sort 0, 1, 2's
    public static void solve4(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 2 Sum
    // TC = O(n)
    public static void solve3(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                System.out.println("True");
                return;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("false");
    }

    // Longest Subarray with sum K
    // TC = O(n)
    public static void solve2(int[] arr, int k) {
        int length = 0;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int n = arr.length;
        while (right < n) {
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                length = Math.max(length, right - left + 1);
            }
            right++;
            if (right < n) {
                sum += arr[right];
            }
        }

        System.out.println(length);
    }

    // Longest Subarray with sum K
    // TC = O(n^2)
    public static void solve1(int[] arr, int target) {
        int length = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];

                if (sum == target) {
                    length = Math.max(length, j - i + 1);
                }
            }
        }

        System.out.println(length);
    }

}
