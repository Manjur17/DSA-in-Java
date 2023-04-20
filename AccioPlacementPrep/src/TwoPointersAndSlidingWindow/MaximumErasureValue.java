package TwoPointersAndSlidingWindow;

import java.util.*;

public class MaximumErasureValue {
    //maximum sum sub array, consisting of only distinct integers
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = maximumUniqueSubarray(arr);
        System.out.println(ans);
    }

    public static int maximumUniqueSubarrayII(int[] arr) {
        int start = 0, end = 0, currSum = 0, maxSum = 0;

        Set<Integer> set = new HashSet<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < arr.length) {
            currSum += arr[end];

            while (set.contains(arr[end])) {
                set.remove(arr[start]);
                currSum -= arr[start];
                start++;
            }

            set.add(arr[end]);
            maxSum = Math.max(maxSum, currSum);
            end++;
        }
        return maxSum;
    }

    public static int maximumUniqueSubarray(int[] arr) {
        int start = 0, end = 0, currSum = 0, maxSum = 0;

        HashMap<Integer, Integer> map = new HashMap<>(); // pair(distinct integer N, count of distinct integer N)

        while (end < arr.length) {
            currSum += arr[end];

            while (map.containsKey(arr[end])) {
                map.remove(arr[start]);
                currSum -= arr[start];
                start++;
            }

            map.put(arr[end], 1);
            maxSum = Math.max(maxSum, currSum);
            end++;
        }
        return maxSum;
    }
}
