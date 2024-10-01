public class Leetcode {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlowers(arr, 1));
    }

    static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int i = 0;

        while (i < len && n > 0) {
            if (flowerbed[i] == 1) {
                i = i + 2;
            } else if (i == len - 1 || flowerbed[i + 1] == 0) {
                n--;
                i = i + 2;
            } else {
                i += 3;
            }

        }
        return n <= 0;
    }
}
