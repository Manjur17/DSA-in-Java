package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaxSubArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
    }

    private static int maxSum(int[] arr) {
        //Kadane's Algorithm
        int maxSum = arr[0];
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            //find the max sum ending and compare with maxSum
            sum = Math.max(sum + arr[i], arr[i]); //maxSumEnding = arr[i] then a new sub array starts
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
