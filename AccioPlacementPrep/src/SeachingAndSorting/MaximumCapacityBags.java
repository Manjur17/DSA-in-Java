package SeachingAndSorting;

import java.util.*;

public class MaximumCapacityBags {

    public static int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        for (int i = 0; i < n; i++) {
            capacity[i] -= rocks[i];
        }
        //capacity rocks tells us how much capacity is left
        Arrays.sort(capacity); //greedy -> fill bags with min capacity
        int count = 0;
        for (int cap : capacity) {
            if (additionalRocks >= cap) {
                count++;
                additionalRocks -= cap;
            } else {
                break;
            }
        }

        return count;
    }
}
