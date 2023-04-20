package SeachingAndSorting;

import java.util.*;

public class CheckArithmeticSequence {
    public boolean canMakeArithmeticProgressionII(int[] arr) {
        Arrays.sort(arr);

        int diff = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != diff)
                return false;
        }

        return true;
    }

    public static boolean canMakeArithmeticProgression(int[] arr) {
        //take care if array has duplicates
        int n = arr.length;
        if (n == 1) return true;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
            min = Math.min(min, val);
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int diff = (max - min) / (n - 1);

        for (int i = 0; i < n; i++) {
            int ai = min + i * diff;
            if (!map.containsKey(ai))
                return false;
            else {
                int freq = map.get(ai);
                map.put(ai, --freq);
                if (freq == 0) {
                    map.remove(ai);
                }
            }
        }
        return true;
    }
}
