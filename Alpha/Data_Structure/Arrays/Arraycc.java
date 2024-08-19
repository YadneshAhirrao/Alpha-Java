import java.util.Arrays;

public class Arraycc {
    public static void main(String[] args) {
        // int [] num = new int[10];
        int number[] = { 12, 2, 34, 4, 56, 6, 78 };
        // updatearr(number);
        // System.out.println(number[0]);
        System.out.println(Arrays.toString(number));
        Arrays.sort(number);
        System.out.println(Arrays.toString(number));
    }

    public static void updatearr(int[] arr) {
        arr[0] = 100;
    }
}
