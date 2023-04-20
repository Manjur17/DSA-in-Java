package HashMaps;

import java.util.HashMap;

public class SecondMostRepeatedWord {
    String secFrequent(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, map.get(arr[i]));
        }

        int smax = 0;
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (map.get(arr[i]) < max && map.get(arr[i]) > smax) {
                ans = arr[i];
                smax = map.get(arr[i]);
            }
        }

        return ans;
    }
}
