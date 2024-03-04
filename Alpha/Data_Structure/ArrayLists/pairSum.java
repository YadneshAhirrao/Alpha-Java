package Alpha.Data_Structure.ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class pairSum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(4);
        // arr.add(5);
        // arr.add(6);
        // arr.add(7);
        // arr.add(8);
        // arr.add(9);

        arr.add(11);
        arr.add(15);
        arr.add(6);
        arr.add(8);
        arr.add(9);
        arr.add(10);

        System.out.println(Arrays.toString(Approch_2(arr, 16)));
    }

    public static int[] Approch_2(ArrayList<Integer> arr, int target) {

        int pivit = 0;

        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1) <= arr.get(i)) {

            } else {
                pivit = i;
                break;
            }
        }

        int lp = pivit;
        int rp = pivit - 1;
        int n = arr.size();
        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == target) {
                return new int[] { lp, rp };
            }

            if (arr.get(lp) + arr.get(rp) < target) {
                lp = (lp + 1) % n;
            }

            if (arr.get(lp) + arr.get(rp) > target) {
                rp = (rp + n - 1) % n;
            }
        }

        return new int[] { -1, -1 };
    }

    public static int[] Approch_1(ArrayList<Integer> arr, int target) {
        int lp = 0;
        int rp = arr.size() - 1;
        while (lp != rp) {
            if (arr.get(lp) + arr.get(rp) == target) {
                return new int[] { lp, rp };
            }

            if (arr.get(lp) + arr.get(rp) < target) {
                lp++;
            }
            if (arr.get(lp) + arr.get(rp) > target) {
                rp--;
            }
        }
        return new int[] { -1, -1 };
    }
}
