package TwoPointersAndSlidingWindow;

import java.util.HashMap;

public class CountOfSubstringsHavingAllUniqueCharacters {
    public static int solution(String s) {
        // write your code here
        int start = 0, end = 0, count = 0;

        HashMap<Character, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)
        while (end < s.length()) {
            char ch = s.charAt(end);

            while (map.containsKey(ch)) {
                int freq = map.get(s.charAt(start));
                map.put(s.charAt(start), --freq);
                if (freq == 0) {
                    map.remove(s.charAt(start)); //remove it as there are no arr[start] in the current window
                }
                start++;
            }
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            count += (end - start + 1);
            end++;
        }

        return count;
    }
}
