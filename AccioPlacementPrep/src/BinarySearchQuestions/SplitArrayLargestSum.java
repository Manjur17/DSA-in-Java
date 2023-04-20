package BinarySearchQuestions;

import java.util.Scanner;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(splitArray(arr, m));
    }

    public static int splitArray(int[] nums, int m) {
        int max = nums[0], maxSum = 0; // non-negative integers in nums
        for (int x : nums) {
            max = Math.max(max, x);
            maxSum += x;
        }
        int low = max, high = maxSum;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int pieces = count(nums, m, mid);
            if (pieces <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int count(int[] nums, int m, int mid) {
        int piecesCount = 1; //min 1 piece is possible
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum +=nums[i];
            if (sum  > mid) {
                piecesCount++;
                sum = nums[i];
            }
        }
        return piecesCount;
    }

}
