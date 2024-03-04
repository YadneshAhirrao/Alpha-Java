package Alpha.Data_Structure.ArrayLists;

import java.util.ArrayList;

public class ContainerWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        // System.out.println(Approch_1(height));
        System.out.println(Approch_2(height));

    }

    public static int Approch_2(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        int lp = 0;
        int rp = height.size() - 1;
        while (lp < rp) {
            int h = Math.min(height.get(lp), height.get(rp));
            int w = Math.abs(rp - lp);
            int sum = h * w;
            max = Math.max(max, sum);
            if (lp > rp) {
                rp++;
            } else {
                lp++;
            }
        }
        return (max);
    }

    public static int Approch_1(ArrayList<Integer> height) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
                int h = Math.min(height.get(i), height.get(j));
                int w = j - i;
                int sum = h * w;

                max = Math.max(max, sum);

            }
        }
        return (max);
    }
}
