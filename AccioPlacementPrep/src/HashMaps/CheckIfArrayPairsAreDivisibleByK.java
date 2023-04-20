package HashMaps;

import java.util.HashMap;

public class CheckIfArrayPairsAreDivisibleByK {
    //returns true if given array can be divided into pairs such that sum of every pair is divisible by k.
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>(); //<Reminder,Frequency>
        for (int val : arr) {
            int rem = val % k;
            if (rem < 0) {
                rem += k;
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        //traverse using map.keySet()
        for (int rem : map.keySet()) {
            if (rem == 0) {
                int freq = map.get(rem);
                if (freq % 2 != 0) {
                    return false;
                }
            } else if (k % 2 == 0 && rem == k / 2) {
                int freq = map.get(rem);
                if (freq % 2 != 0) {
                    return false;
                }
            } else {
                int freq1 = map.get(rem);
                int freq2 = map.getOrDefault(k - rem, 0);
                if (freq1 != freq2) {
                    return false;
                }
            }
        }
        return true;
    }
}
