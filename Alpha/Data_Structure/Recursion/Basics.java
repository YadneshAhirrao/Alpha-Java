import java.util.Arrays;

public class Basics {

    public static void printDec(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n + " ");
        printDec(n - 1);
    }

    public static void printInc(int n) {
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }
        printInc(n - 1);
        System.out.print(n + " ");
    }

    public static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        }

        int sum1 = sumNatural(n - 1);
        int sum = n + sum1;

        return sum;
    }

    public static int factorialNumber(int n) {
        if (n == 0) {
            return 1;
        }

        int fact1 = factorialNumber(n - 1);
        int fact = n * fact1;

        return fact;
    }

    public static int fiboNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fibo = fiboNumber(n - 1) + fiboNumber(n - 2);
        return fibo;
    }

    public static int fiboNumber_1(int n, int[] dp) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (dp[n] != -1) {
            return dp[n];
        }
        dp[n] = fiboNumber_1(n - 1, dp) + fiboNumber_1(n - 2, dp);
        return dp[n];
    }

    public static boolean isSorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }

        if (arr[i] > arr[i + 1]) {
            return false;
        }

        return isSorted(arr, i + 1);
    }

    public static void removeDublicate(String str, int idx, StringBuilder sb, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(sb);
            return;
        }

        char curr = str.charAt(idx);
        if (map[curr - 'a'] == true) {
            removeDublicate(str, idx + 1, sb, map);
        } else {
            map[curr - 'a'] = true;
            removeDublicate(str, idx + 1, sb.append(curr), map);
        }
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);

        merge(arr, si, mid, ei);
    }

    public static void merge(int[] arr, int si, int mid, int ei) {
        int[] temp = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void quickSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int pIdx = partion(arr, si, ei);
        quickSort(arr, si, pIdx - 1);
        quickSort(arr, pIdx + 1, ei);
    }

    public static int partion(int[] arr, int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1;

        for (int j = 0; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        // String str = "ahirrao";
        // removeDublicate(str, 0, new StringBuilder(), new boolean[26]);
        // int[] arr = { 10, 20, 300, 40, 50, 60 };
        // printDec(5);
        // printInc(5);
        // System.out.println(sumNatural(5));
        // System.out.println(factorialNumber(15));
        // System.out.println(factorialNumber(15));
        // System.out.println(isSorted(arr, 0));
        // mergeSort(arr, 0, arr.length - 1);
        int n = 5;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(fiboNumber_1(n, dp));
        // quickSort(arr, 0, arr.length - 1);
        // System.out.println(Arrays.toString(arr));
    }
}
