package HashMaps;

import java.util.*;

public class KDiffPairsInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findPairs(arr, k));
    }

    public int TotalPairs(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (k == 0 && map.get(num) == 2)
                count++;
        }

        if (k == 0) {
            return count;
        }

        for (int j : arr) {
            if (map.containsKey(k + j)) {
                int freq = map.get(j);
                if (freq > 0) {
                    count++;
                    map.put(j, 0); // so that when duplicates comes [11,5,16,11,10] k = 5
                }
            }
        }

        return count;
    }

    public static int findPairs(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : nums) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int count = 0;

        for (int x : map.keySet()) {
            if ((k > 0 && map.containsKey(x + k)) || (k == 0 && map.get(x) >= 2)) {
                count++;
            }
        }

        return count;
    }

    public int findPairsBrute(int[] arr, int k) {
        //brute force
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (arr[j] - arr[i] == k) {
                count++;
                j++;
                i++;
                while (j < n && arr[j] == arr[j - 1]) {
                    j++;
                }
            } else if (arr[j] - arr[i] < k) {
                j++;
            } else {
                i++;
            }
            if (i == j) {
                j++;
            }
        }

        return count;
    }
}
