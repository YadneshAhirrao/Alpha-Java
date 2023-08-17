package Alpha.Data_Structure.Arrays;

import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        int ct = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ct;
            ct += 2;
        }

        System.out.println(Arrays.toString(arr));
        ReverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
    

    public static void ReverseArr(int[] arr) {

        //Approch 1

        // for (int i = 0; i < arr.length / 2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[arr.length - i - 1];
        //     arr[arr.length - i - 1] = temp;
        // }

        //Approch 2

        int first = 0;
        int last = arr.length-1;

        while (first < last) {
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
    }
}
