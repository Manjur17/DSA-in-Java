package TwoPointersAndSlidingWindow;

import java.util.*;

public class MinimumWindowSubstringII {
    //Smallest Substring Of A String Containing All Unique Characters Of Itself
    public static int solution(String s) {
        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
                set.add(s.charAt(i));
            }
        }
        String t = sb.toString();
        return minWindowMap(s, t).length();
    }

    static String minWindowMap(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) return "";
        int minLen = Integer.MAX_VALUE;
        String ans = "";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        int i = 0, j = 0, count = 0;

        while (j < m) {
            if (map.containsKey(s.charAt(j))) {
                if (map.get(s.charAt(j)) > 0) {
                    count++;
                }

                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
            }
            while (count == n) {
                if (minLen > j - i + 1) {
                    minLen = j - i + 1;
                    ans = s.substring(i, j + 1); // i = start point of ans
                }
                if (map.containsKey(s.charAt(i))) {
                    map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                    if (map.get(s.charAt(i)) > 0) {
                        count--;
                    }
                }
                i++;
            }
            j++;
        }

        return ans;
    }
}
