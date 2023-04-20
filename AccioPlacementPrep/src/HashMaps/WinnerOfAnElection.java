package HashMaps;

import java.util.HashMap;

public class WinnerOfAnElection {
    public static String[] winner(String[] arr, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            max = Math.max(max, map.get(arr[i]));
        }

        String[] ans = new String[2];
        ans[1] = max + "";
        boolean flag = false;

        for (String s : map.keySet()) {
            if (map.get(s) == max) {
                if (!flag) {
                    ans[0] = s;
                    flag = true;
                } else {
                    ans[0] = (s.compareTo(ans[0]) < 0) ? s : ans[0];
                }
            }
        }

        return ans;
    }
}
