package TwoPointersAndSlidingWindow;

import java.util.*;

public class EquivalentSubArrays {
    // A sub array is equivalent if,
    // count of unique integers in the sub array = count of unique integers in the given array.
    static int countDistinctSubarray(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (!set.contains(arr[i])) {
                k++;
            }
            set.add(arr[i]);
        }

        return subarraysWithKDistinct(arr, k);
    }

    public static int subarraysWithKDistinct(int[] arr, int k) {
        int n = arr.length;
        return (atMostK(arr, n, k) - atMostK(arr, n, k - 1));
    }

    private static int atMostK(int[] arr, int n, int k) {
        //Count Of Sub-arrays Having At Most K Unique Characters
        int start = 0, end = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < n) {

            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > k) { //map.size represents no of distinct integers in the sub-array so far
                //decrease the window size so that at most k distinct in our current window
                int freq = map.get(arr[start]);
                map.put(arr[start], --freq);
                if (freq == 0) {
                    map.remove(arr[start]); //remove it as there are no arr[start] in the current window
                }
                start++;
            }

            count += (end - start + 1);
            end++;
        }
        return count;
    }
}
