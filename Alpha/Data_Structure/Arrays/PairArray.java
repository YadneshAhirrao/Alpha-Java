

public class PairArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        // int arr[] = { 1, -2, 6, -1, 3 };
        MakePair(arr);
        SubArray(arr);
        SubArraySum(arr);
    }

    public static void MakePair(int arr[]) {
        int ct = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                ct++;
            }
            System.out.println();
        }
        System.out.println("Total Number Of Pairs are :" + ct);
    }

    public static void SubArray(int[] arr) {
        int ct = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                if (sum > max) {
                    max = sum;
                }
                if (sum < min) {
                    min = sum;
                }
                sum = 0;
                ct++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Number of Sub Array are : " + ct);
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }

    public static void SubArraySum(int[] arr) {
        int ct = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    sum = sum + arr[k];
                }
                System.out.println(sum);
                max= Math.max(max,sum);
                min= Math.min(min, sum);
                sum = 0;
                ct++;
            }
        }
        System.out.println("Total Number of Sub Array are : " + ct);
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
