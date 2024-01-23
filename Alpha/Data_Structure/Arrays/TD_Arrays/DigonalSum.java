package Alpha.Data_Structure.Arrays.TD_Arrays;

public class DigonalSum {
    public static void main(String[] args) {
        // int[][] arr = {
        //         { 1, 2, 3, 4 },
        //         { 5, 6, 7, 8 },
        //         { 9, 10, 11, 12 },
        //         { 13, 14, 15, 16 }
        // };

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(digsum_1(arr));
        System.out.println(digsum_2(arr));
    }

    // the First Approch has TC = O(n^2)
    public static int digsum_1(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }

                if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        }
        if(arr.length % 2 != 0){
            sum = sum - arr[arr.length/2][arr.length/2];
        }
        return sum;
    }

    // The Second Approch has a TC = O(n)
    public static int digsum_2(int arr[][]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];

            if (i != arr.length - i - 1) {
                sum += arr[i][arr.length - i - 1];
            }
        }
        return sum;
    }
}
