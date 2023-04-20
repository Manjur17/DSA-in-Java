package TwoPointersAndSlidingWindow;

import java.util.*;
import java.util.List;

public class LongestSubarrayHackerRank {
    public static int longestSubarray(List<Integer> arr) {
        // Write your code here
        int max = 1;
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 1;
        while (i < arr.size() - 1) {
            set.add(arr.get(i));
            while (j < arr.size() && Math.abs(arr.get(i) - arr.get(j)) < 2) {
                if (!set.contains(arr.get(j))) {
                    if (set.size() == 2) {
                        break;
                    } else {
                        set.add(arr.get(j));
                    }
                }
                ++j;
            }

            max = Math.max(max, j - i);

            j = ++i + 1;
            set.clear();
        }
        return max;
    }

    public static int longestSubarrayII(List<Integer> list) {
        // Write your code here
        int start = 0, end = 0, maxLen = 0;
        int n = list.size();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < n) {
            map.put(arr[end], map.getOrDefault(arr[end], 0) + 1);

            while (map.size() > 2 || arr[end] - arr[start] > 1) { //map.size represents no of distinct integers in the sub-array so far
                //decrease the window size so that at most k distinct in our current window
                int freq = map.get(arr[start]);
                map.put(arr[start], --freq);
                if (freq == 0) {
                    map.remove(arr[start]); //remove it as there are no arr[start] in the current window
                }
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }


        return maxLen;
    }
}
