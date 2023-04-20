package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        System.out.println(lenOfLongSubarr(arr, n, k));
    }

    public static int lenOfLongSubarr(int[] arr, int n, int k) {
        int maxLen = 0, currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); //<PrefixSum,Index>
        for (int i = 0; i < n; i++) {
            currSum += arr[i];

            if (currSum == k)
                maxLen = i + 1;

            if (map.containsKey(currSum - k)) {
                int start = map.get(currSum - k) + 1;
                int end = i;
                maxLen = Math.max(maxLen, end - start + 1);
            }

            if (!map.containsKey(currSum))
                map.put(currSum, i);

        }

        return maxLen;
    }
}
