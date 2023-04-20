package TwoPointersAndSlidingWindow;

import java.util.*;

public class MinimumConsecutiveCardsToPickUp {
    public int minimumCardPickupII(int[] arr) {
        int start = 0, end = 0, ans = Integer.MAX_VALUE;

        HashSet<Integer> set = new HashSet<>();

        while (end < arr.length) {

            while (set.contains(arr[end])) {
                ans = Math.min(ans, end - start + 1);
                set.remove(arr[start]);
                start++;
            }

            set.add(arr[end]);
            end++;
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }

    public int minimumCardPickup(int[] arr) {
        int start = 0, end = 0, ans = Integer.MAX_VALUE;
        //we can also use a hashset
        HashMap<Integer, Integer> map = new HashMap<>();

        while (end < arr.length) {

            while (map.containsKey(arr[end])) {
                ans = Math.min(ans, end - start + 1);
                map.remove(arr[start]);
                start++;
            }

            map.put(arr[end], 1);
            end++;
        }

        return (ans == Integer.MAX_VALUE) ? -1 : ans;
    }
}
