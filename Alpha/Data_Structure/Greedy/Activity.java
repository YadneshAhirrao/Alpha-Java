import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Activity {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };

        // sorting
        int[][] activities = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        // lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingInt(o -> o[2]));

        // end time basis sort
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastAct = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastAct) {
                maxAct++;
                ans.add(activities[i][0]);
                lastAct = activities[i][2];
            }
        }

        System.out.println(maxAct);
        System.out.println(ans);

    }
}
