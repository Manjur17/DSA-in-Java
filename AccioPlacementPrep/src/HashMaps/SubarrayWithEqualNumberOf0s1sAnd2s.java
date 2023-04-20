package HashMaps;

import java.util.HashMap;

public class SubarrayWithEqualNumberOf0s1sAnd2s {
    long getSubstringWithEqual012(String str) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("0#0", 1);

        int zc = 0, oc = 0, tc = 0;

        int ans = 0;

        //  looping into string
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == '0')
                zc++;
            else if (str.charAt(i) == '1')
                oc++;
            else
                tc++;

            // making key of differences (z[i] - o[i], z[i] - t[i])
            String key = (zc - oc) + "#" + (zc - tc);

            ans += map.getOrDefault(key, 0);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        return ans;
    }
}
