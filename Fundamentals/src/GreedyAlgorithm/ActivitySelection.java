package GreedyAlgorithm;

import java.util.Arrays;

class Activity implements Comparable<Activity> {
    int start;
    int finish;

    Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    @Override
    public int compareTo(Activity o) {
        return this.finish - o.finish;
    }
}

public class ActivitySelection {
    public static void main(String[] args) {
        Activity[] arr = {
                new Activity(12, 25),
                new Activity(10, 20),
                new Activity(20, 30)
        };
        System.out.println(maxActivity(arr));
    }

    public static int maxActivity(Activity[] arr) {
        Arrays.sort(arr);
        int result = 1, prev = 0;
        for (int curr = 1; curr < arr.length; curr++) {
            if (arr[curr].start >= arr[prev].finish) {
                result++;
                prev = curr;
            }
        }
        return result;
    }
}
