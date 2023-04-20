package BitManipulation;

import java.util.HashMap;

public class CountZerosXorPairs {
    public static long calculate(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int val : arr) {
            if (map.containsKey(val)) {
                count += map.get(val);
                //if a ^ b = B -> then b can only XOR with a to give B and no other element
                //to handle duplicates
                // set.remove(0 ^ val);
            }

            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        return count;
    }
}
