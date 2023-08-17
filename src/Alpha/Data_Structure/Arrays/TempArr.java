package Alpha.Data_Structure.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TempArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {-7, -3, -2, -100, -5, -7, -9};
        int brr[] = new int[5];
        //System.out.println(kadanesneg(arr));

        for (int i : brr) {
            i = sc.nextInt();
        }


        System.out.println(Arrays.toString(brr));
    }

    public static int kadanesneg(int arr[]){
        int n = arr.length;
        int sum = 0, maxi = Integer.MIN_VALUE;

        for(int i=0; i<n; i++) {
            sum += arr[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0) sum = 0;
        }

        return maxi; 
    }
}
