package BinarySearchQuestions;

import java.util.Scanner;

public class MinimizedMaximumOfProductsDistributed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimizedMaximum(k, arr));
    }

    public static int minimizedMaximum(int n, int[] nums) {
        int low = 1;
        int high = nums[0];
        for (int val : nums) {
            if (val > high) {
                high = val;
            }
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(nums, mid, n)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int mid, int n) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.ceil((double) num / mid);
        }
        return sum <= n;
    }
}
