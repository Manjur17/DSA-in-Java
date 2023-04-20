package HashMaps;

import java.util.HashMap;

public class FirstRepeatedCharacter {
    //the first character that occurs more than once and whose index of second occurrence is smallest
    String firstRepChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            int freq = map.getOrDefault(ch, 0);
            if (freq > 1) return ch + "";
        }

        return -1 + "";
    }
}
