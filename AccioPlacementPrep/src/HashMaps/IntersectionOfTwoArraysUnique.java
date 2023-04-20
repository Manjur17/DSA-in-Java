package HashMaps;

import java.util.*;

public class IntersectionOfTwoArraysUnique {
    public int[] intersectionII(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n1 = nums1.length, n2 = nums2.length;
        Set<Integer> ds = new HashSet<>();
        int i = 0, j = 0;
        while (i < n1 && j < n2) {
            if (nums1[i] == nums2[j]) {
                ds.add(nums1[i++]);
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int k = 0;
        int[] ans = new int[ds.size()];
        for (Integer val : ds) {
            ans[k++] = val;
        }
        return ans;
    }

    public int[] intersection(int[] nums1, int[] nums2) {
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
                    map.put(val, 0);
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
