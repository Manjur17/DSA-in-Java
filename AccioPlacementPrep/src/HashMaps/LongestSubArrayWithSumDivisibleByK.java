package HashMaps;

import java.util.HashMap;

public class LongestSubArrayWithSumDivisibleByK {
    static int longSubarrWthSumDivByK(int[] arr, int n, int k) {
        int maxLen = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<Reminder,Index>
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            int rem = currSum % k;
            if (rem < 0)
                rem += k;

            if (rem == 0)
                maxLen = i + 1;

            if (map.containsKey(rem)) {
                int start = map.get(rem) + 1;
                int end = i;
                maxLen = Math.max(maxLen, end - start + 1);
            }

            if (!map.containsKey(rem))
                map.put(rem, i);

        }
        return maxLen;
    }
}
