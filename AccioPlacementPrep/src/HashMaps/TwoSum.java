package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if (isPair(arr, k)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }

    public static boolean isPair(int[] a, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : a) {
            if (set.contains(target - val)) {
                return true;
            }
            set.add(val);
        }
        return false;
    }

    public int[] twoSumBrute(int[] arr, int target) {
        for (int i = 0; i < (arr.length - 1); i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSum(int[] a, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if (map.containsKey(target - a[i])) {
                ans[0] = map.get(target - a[i]);
                ans[1] = i;
                break; // 1 solution
            }

            map.put(a[i], i);
        }

        return ans;
    }
}
