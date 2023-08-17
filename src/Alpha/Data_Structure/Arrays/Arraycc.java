package Alpha.Data_Structure.Arrays;

public class Arraycc {
    public static void main(String[] args) {
        // int [] num = new int[10];
        int number[] = { 12, 23, 34, 45, 56, 67, 78 };
        updatearr(number);
        System.out.println(number[0]);
    }

    public static void updatearr(int[] arr) {
        arr[0] = 100;
    }
}
