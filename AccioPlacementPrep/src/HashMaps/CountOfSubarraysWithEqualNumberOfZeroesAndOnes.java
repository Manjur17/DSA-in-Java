package HashMaps;

import java.util.HashMap;

public class CountOfSubarraysWithEqualNumberOfZeroesAndOnes {
    public int findMaxLength(int[] arr) {
        int n = arr.length, count = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            currSum += (arr[i] == 0) ? -1 : 1;
            if (currSum == 0)
                count++;
            if (map.containsKey(currSum))
                count += map.get(currSum);

            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }
        return count;
    }
}
