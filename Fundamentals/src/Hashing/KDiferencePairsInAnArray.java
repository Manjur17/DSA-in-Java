package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class KDiferencePairsInAnArray {
    public static int[] arrayFunction() {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0, j = 1;
        while (i < nums.length && j < nums.length) {
            if (i != j && nums[j] - nums[i] == k) {
                count++;
                j++;
                i++;
                while (j < nums.length && nums[j] == nums[j - 1]) {
                    j++;
                }
            } else if (nums[j] - nums[i] < k) {
                j++;
            } else {
                i++;
            }
        }
        return count;
    }

    public static int findPairsBetter(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int ans = 0;
        for (int x : map.keySet()) {
            if ((k > 0 && map.containsKey(x + k)) || (k == 0 && map.get(x) > 1)) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = arrayFunction();
        int k = s.nextInt();
        System.out.println(findPairs(arr, k));
        int ans = findPairsBetter(arr, k);
        System.out.println(ans);
    }
}
