package Alpha.Data_Structure.Arrays;

public class TrappedRain {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
        // int arr[] = { 1,8,6,2,5,4,8,3,7 };
        // trappedwater(arr);
        System.out.println(trappedrainwater(arr));
    }

    public static void trappedwater(int[] arr) {
        int[] lm = new int[arr.length];
        int[] rm = new int[arr.length];
        int lmax = Integer.MIN_VALUE;
        int rmax = Integer.MIN_VALUE;
        int water = 0;
        int totalwater = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lmax) {
                lmax = arr[i];
            }
            lm[i] = lmax;

            int ii = arr.length - 1 - i;
            if (arr[ii] > rmax) {
                rmax = arr[ii];
            }
            rm[ii] = rmax;

            water = Math.min(lm[i], rm[i]);
            totalwater = totalwater + (Math.abs(arr[i] - water));
        }

        System.out.println(totalwater);
    }

    public static int trappedrainwater(int arr[]) {
        int n = arr.length;
        // left most bondry array
        int leftmax[] = new int[n];
        leftmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(arr[i], leftmax[i - 1]);
        }

        // right max
        int rightmax[] = new int[n];
        rightmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(arr[i], rightmax[i + 1]);
        }

        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedwater += waterlevel - arr[i];

        }

        return trappedwater;
    }
}
