package HashMaps;

import java.util.HashMap;

public class RepeatAndMissingNumberArray {
    //[1-N]
    //Optimal approach is cyclic sort
    public int[] repeatedNumber(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2)
                    ans[0] = i;
            } else {
                ans[1] = i;
            }
        }

        return ans;
    }
}
