package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaxSubArraySumOfSizeK {
    public static void maxSumBrute(int[] arr, int k) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n - k + 1; i++) {
            int sum = 0;
            for (int j = 0; j < k; j++) {
                sum += arr[i + j];
            }
            ans = Math.max(ans, sum);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        maxSum = sum;
        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k];
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
