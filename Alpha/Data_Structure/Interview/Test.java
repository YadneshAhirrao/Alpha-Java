// Method take input as a array and return 2nd largest;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 5};
        System.out.println(findSecondMax(arr));
    }

    // max = 3 -> 5
    // secondMax = 0 -> 2 -> 3

    public static int findSecondMax(int[] arr) {
        int max = arr[0];
        int secondMax = 0;

        for(int i = 0; i< arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }


}
