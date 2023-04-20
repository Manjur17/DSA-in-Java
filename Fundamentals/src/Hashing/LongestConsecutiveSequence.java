package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void longestConsecutiveSequence(int[] arr) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int val : arr) {
            map.put(val, true);
        }
        for (int val : arr) {
            if (map.containsKey(val - 1)) {
                map.put(val, false);
            }
        }
        int msp = 0;
        int ml = 0;
        for (int val : arr) {
            if (map.get(val)) {
                int tl = 1;
                while (map.containsKey(val + tl)) {
                    tl++;
                }
                if (tl > ml) {
                    ml = tl;
                    msp = val;
                }
            }
        }
        for (int i = 0; i < ml; i++) {
            System.out.print((msp + i) + " ");
        }
        System.out.println();
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        for (int num : nums) {
            num_set.add(num);
        }

        int longestStreak = 0;

        for (int num : num_set) {
            if (!num_set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (num_set.contains(currentNum+1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }
    public static void main(String[] args) {
        int[] arr = arrayFunction();
        longestConsecutiveSequence(arr);
        System.out.println(longestConsecutive(arr));
    }
}
