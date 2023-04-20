package TwoPointersAndSlidingWindow;

import java.util.HashMap;

public class SubstringsWithExactlyKUniqueCharacters {
    public static int solution(String s, int k) {
        return (atMostK(s.toCharArray(), k) - atMostK(s.toCharArray(), k - 1));
    }

    private static int atMostK(char[] arr, int k) {
        //Count Of Substrings Having At Most K Unique Characters
        int start = 0, end = 0, count = 0;
        HashMap<Character, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < arr.length) {

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
