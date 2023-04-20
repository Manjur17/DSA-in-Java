package TwoPointersAndSlidingWindow;

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {
    static int longestSubstringDistinctChars(String s) {
        HashSet<Character> set = new HashSet<>();
        int start = 0, end = 0, maxLen = -1;
        int n = s.length();
        while (end < n) {
            char ch = s.charAt(end);

            while (set.contains(ch)) {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(ch);

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;

    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0, end = 0, maxLen = 0;
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < n) {
            char ch = s.charAt(end);

            while (map.containsKey(ch)) {
                map.remove(s.charAt(start));
                start++;
            }
            map.put(ch, 1);

            maxLen = Math.max(maxLen, end - start + 1);
            end++;
        }

        return maxLen;
    }
}
