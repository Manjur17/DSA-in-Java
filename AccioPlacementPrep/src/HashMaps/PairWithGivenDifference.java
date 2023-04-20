package HashMaps;

import java.util.HashMap;

public class PairWithGivenDifference {
    static boolean findPair(int[] arr, int n, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // EDGE CASE [2,2,3,6,5] and target = 0
            // we have a pair (2,2)
            if (target == 0 && map.get(arr[i]) > 1)
                return true;
        }

        // Check if difference is zero, and
        // we are unable to find any duplicate or
        // element whose frequency is greater than 1
        // then no such pair found.
        if (target == 0)
            return false;

        for (int i = 0; i < n; i++) {
            if (map.containsKey(target + arr[i])) {
                return true;
            }
        }

        return false;
    }

    public int solve(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int x : map.keySet()) {
            if ((k != 0 && map.containsKey(x + k)) || (k == 0 && map.get(x) > 1)) {
                return 1;
            }
        }

        return 0;
    }
}
