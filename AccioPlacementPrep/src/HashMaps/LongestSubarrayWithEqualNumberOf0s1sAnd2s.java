package HashMaps;

import java.util.Arrays;
import java.util.HashMap;

public class LongestSubarrayWithEqualNumberOf0s1sAnd2s {
    public static int solution(int[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0#0", -1);

        int zc = 0, oc = 0, tc = 0;

        int ans = 0;

        //  looping into string
        for (int i = 0; i < arr.length; i++) {

            // Increasing the count of current character
            if (arr[i] == 0)
                zc++;
            else if (arr[i] == 1)
                oc++;
            else
                tc++;

            // making key of differences (z[i] - o[i], z[i] - t[i])
            String key = (zc - oc) + "#" + (zc - tc);

            if (map.containsKey(key)) {
                int start = map.get(key);
                int end = i;
                ans = Math.max(ans, end - start);
            }

            if (!map.containsKey(key))
                map.put(key, i);
        }

        return ans;
    }
}
