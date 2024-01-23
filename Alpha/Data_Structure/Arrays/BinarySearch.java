package Alpha.Data_Structure.Arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {12, 15, 23, 34, 46, 56, 67, 78, 90};
        int key = 56;
        int index = BinSearch(arr,key);
        System.out.println(index); 
        
    }

    public static int BinSearch(int arr[], int key) {
        int start = 0;
        int end = arr.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    
}
