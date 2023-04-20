package HashMaps;

import java.util.HashMap;

public class MinimumIndexedCharacter {
    public static int minIndexChar(String s, String pat) {
        HashMap<Character, Integer> map = new HashMap<>(); //<Char, FirstIndex>
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!map.containsKey(ch))
                map.put(ch, i);
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < pat.length(); i++) {
            char ch = pat.charAt(i);
            if (map.containsKey(ch))
                res = Math.min(res, map.get(ch));
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
