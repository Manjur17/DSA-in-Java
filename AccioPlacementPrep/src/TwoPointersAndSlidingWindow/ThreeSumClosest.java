package TwoPointersAndSlidingWindow;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int sum1 = Integer.MAX_VALUE, sum2 = Integer.MIN_VALUE;

        for (int i = 0; i < n - 2; i++) {
            int target_x = target - arr[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                if (arr[left] + arr[right] == target_x) {
                    return arr[i] + arr[left] + arr[right];
                } else if (arr[left] + arr[right] > target_x) {
                    sum1 = Math.min(sum1, arr[i] + arr[left] + arr[right]);
                    right--;
                } else {
                    sum2 = Math.max(sum2, arr[i] + arr[left] + arr[right]);
                    left++;
                }
            }
        }

        if (sum1 == Integer.MAX_VALUE) return sum2;
        if (sum2 == Integer.MIN_VALUE) return sum1;

        int diff1 = target - sum2;
        int diff2 = sum1 - target;

        return (diff1 < diff2) ? sum2 : sum1;
    }
}
