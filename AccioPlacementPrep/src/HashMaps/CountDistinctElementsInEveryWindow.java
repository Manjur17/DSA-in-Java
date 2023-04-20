package HashMaps;

import java.util.*;

public class CountDistinctElementsInEveryWindow {
    public int[] countDistinct(int[] arr, int k) {
        int n = arr.length;
        int[] ans = new int[n - k + 1];//no of windows
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //process for 1st window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans[j++] = map.size();
        //process for rest of window
        for (int i = k; i < n; i++) {
            int freq = map.get(arr[i - k]);
            map.put(arr[i - k], --freq);
            if (freq == 0)
                map.remove(arr[i - k]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans[j++] = map.size();
        }

        return ans;
    }

    ArrayList<Integer> countDistinct(int[] arr, int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        //process for 1st window
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        list.add(map.size());
        //process for rest of window
        for (int i = k; i < n; i++) {
            int freq = map.get(arr[i - k]);
            map.put(arr[i - k], --freq);
            if (freq == 0)
                map.remove(arr[i - k]);

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            list.add(map.size());
        }
        return list;
    }
}
