package TwoPointersAndSlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithExactlyKDistinctCharacters {
    public int longestKSubstring(String s, int k) {
        int start = 0, end = 0, maxLen = -1;
        HashMap<Character, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < s.length()) {
            char ch = s.charAt(end);


            while (map.size() > k) {
                int freq = map.get(s.charAt(start));
                map.put(s.charAt(start), --freq);
                if (freq == 0) {
                    map.remove(s.charAt(start)); //remove it as there are no arr[start] in the current window
                }
                start++;
            }

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            if(map.size() == k)
                maxLen = Math.max(maxLen, (end - start + 1));

            end++;
        }
        return maxLen;
    }
}
