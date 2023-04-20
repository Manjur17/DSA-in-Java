package HashMaps;

import java.util.*;

public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(maximumFrequency(str));
    }

    private static char maximumFrequency(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        char ans = str.charAt(0);

        for (Character key : map.keySet()) {
            if (map.get(key) > map.get(ans)) {
                ans = key;
            }
        }
        return ans;
    }
}
