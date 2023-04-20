package HashMaps;

import java.util.HashMap;

public class LongestSubarrayWithEqualNumberOfZeroesAndOnes {
    public int findMaxLength(int[] arr) {
        int maxLen = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<PrefixSum,Index>
        for (int i = 0; i < arr.length; i++) {
            currSum += (arr[i] == 0) ? -1 : 1;

            if (currSum == 0)
                maxLen = i + 1;

            if (map.containsKey(currSum)) {
                int start = map.get(currSum) + 1;
                int end = i;
                maxLen = Math.max(maxLen, end - start + 1);
            }

            if (!map.containsKey(currSum))
                map.put(currSum, i);

        }
        return maxLen;
    }

    public int findMaxLengthBrute(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int zeros = 0, ones = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    zeros++;
                } else {
                    ones++;
                }
                if (zeros == ones) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
