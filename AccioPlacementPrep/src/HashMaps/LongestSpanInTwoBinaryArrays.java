package HashMaps;

import java.util.HashMap;

public class LongestSpanInTwoBinaryArrays {
    int longestCommonSum(boolean[] arr1, boolean[] arr2, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int v1 = (arr1[i]) ? 1 : 0;
            int v2 = (arr2[i]) ? 1 : 0;
            arr[i] = v1 - v2;
        }

        int maxLen = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<PrefixSum,Index>
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

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
}
