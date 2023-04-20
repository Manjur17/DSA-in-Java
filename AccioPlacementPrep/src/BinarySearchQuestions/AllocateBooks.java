package BinarySearchQuestions;

import java.util.Scanner;

public class AllocateBooks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long m = sc.nextInt();
        if (m > n) {
            System.out.println("-1");
        } else {
            System.out.println(splitArray(arr, m));
        }
    }

    public static long splitArray(int[] nums, long m) {
        int n = nums.length;
        long max = nums[0], maxSum = 0; // non-negative integers in nums
        for (int x : nums) {
            max = Math.max(max, x);
            maxSum += x;
        }
        long low = max, high = maxSum;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long pieces = count(nums, m, mid);
            if (pieces <= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static long count(int[] nums, long m, long mid) {
        long piecesCount = 1; //min 1 piece is possible
        long sum = 0;
        for (int x : nums) {
            sum += x;
            if (sum > mid) {
                piecesCount++;
                sum = x;
            }
        }
        return piecesCount;
    }
}
