package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = smallestSubWithSum(arr, n, k);
        System.out.println(ans);
    }

    public static int smallestSubWithSum(int[] arr, int n, int target) {
        int ans = Integer.MAX_VALUE, sum = 0;
        int start = 0, end = 0;

        while (end < n) {
            sum += arr[end];

            while (sum >= target) {
                sum -= arr[start];
                ans = Math.min(ans, end - start + 1);
                start++;
            }
            end++;
        }

        return (ans == Integer.MAX_VALUE) ? 0 : ans;
    }
}
