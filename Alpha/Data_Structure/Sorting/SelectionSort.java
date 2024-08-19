import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 300, 4, 500, 60, 1 };
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }

            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }
}
