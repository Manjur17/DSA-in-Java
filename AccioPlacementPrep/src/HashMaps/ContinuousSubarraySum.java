package HashMaps;

import java.util.*;

public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] arr, int k) {
        int n = arr.length, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<Reminder,firstOccurrence>

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            int rem = currSum % k;

            if (rem == 0 && i >= 1)
                return true;

            if (map.containsKey(rem)) {
                int start = map.get(rem);
                int end = i;
                if (end - start >= 2) return true;
            }

            if (!map.containsKey(rem))
                map.put(rem, i);

        }

        return false;
    }
}
