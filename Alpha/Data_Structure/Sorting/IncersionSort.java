import java.util.Arrays;

public class IncersionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 300, 4, 500, 60, 1 };
        System.out.println(Arrays.toString(arr));
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                System.out.println(Arrays.toString(arr));
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }

        }
    }
}
