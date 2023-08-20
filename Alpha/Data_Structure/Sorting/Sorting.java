package Alpha.Data_Structure.Sorting;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 0, 1, 2};
        System.out.println(Arrays.toString(arr));
        //bubblesort(arr);
        //selectionsort(arr);
        // Insertionsort(arr);
        Insertionsort_simple(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubblesort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int swaps = 0;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
            }
        }
    }

    public static void selectionsort(int arr[]) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int minpose = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[minpose] > arr[j]) {
                    minpose = j;
                }
            }

            int temp = arr[minpose];
            arr[minpose] = arr[i];
            arr[i] = temp;
        }
    }

    public static void Insertionsort(int[] arr){
        for (int i = 1; i <= arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;

            while (prev >=0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev];
                prev--;
            }

            arr[prev+1] = curr;
        }
    }

    public static void Insertionsort_simple(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int j = i;

            while (j>0 && arr[j-1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    public static void CountingSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i],max);
        }

        int count[] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++; 
        }
        int j = 0;
        for (int i = 0; i < max; i++) {
            arr[j] = i;
            j++;
            count[i]--;
        }
    }
}
