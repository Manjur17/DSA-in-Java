package HashMaps;

import java.util.*;

public class GroupShiftedString {
    private static String getKey(String s) {
        StringBuilder key = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            char curr = s.charAt(i), prev = s.charAt(i - 1);
            int diff = curr - prev;
            if (diff < 0)
                diff += 26;
            key.append(diff).append("#"); // add # to make sure there is no overlap
        }
        return key.toString();
    }

    public static ArrayList<ArrayList<String>> groupShiftedStrings(String[] strs) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String s : strs) {
            String key = getKey(s);
            ArrayList<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();

        for (ArrayList<String> s : map.values()) {
            ans.add(s);
        }

        return ans;
    }
}
