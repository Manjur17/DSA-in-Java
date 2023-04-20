package GreedyQuestions;

import java.util.*;

class Activity {
    int start;
    int end;

    Activity(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class ActivitySelection {
    public static int activitySelection(int[] start, int[] end, int n) {
        ArrayList<Activity> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Activity(start[i], end[i])); // 1 based indexing
        }

        Collections.sort(list, (a1, a2) -> (a1.end - a2.end));

        int count = 1;// 1st activity  will happy
        int limit = list.get(0).end;

        for (int i = 1; i < n; i++) {
            if (list.get(i).start > limit) {
                limit = list.get(i).end;
                count++;
            }
        }

        return count;
    }
}
