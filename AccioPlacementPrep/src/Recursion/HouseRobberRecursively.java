package Recursion;

import java.util.Scanner;

public class HouseRobberRecursively {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums) {
        return helper(nums, nums.length - 1);
    }

    public static int helper(int[] arr, int end) {
        if (end < 0) return 0;

        int option1 = helper(arr, end - 1);
        int option2 = arr[end] + helper(arr, end - 2);

        return Math.max(option1, option2);
    }
}
