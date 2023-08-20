package Alpha.Data_Structure.Striver_A_to_Z_DSA;

public class Striver_Arrays_1 {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 4, 6 };
        System.out.println(LargestElement(arr));
    }

    // 1. Find the largest element in the array
    public static int LargestElement(int[] arr) {
        int larger = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > larger) {
                larger = arr[i];
            }
        }
        return larger;
    }
}
