package HashMaps;

import java.util.*;

public class IntersectionOfTwoArrays {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : nums1) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (int val : nums2) {
            if (map.containsKey(val)) {
                int freq = map.get(val);
                if (freq > 0) {
                    list.add(val);
                    map.put(val, --freq);
                }
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}
