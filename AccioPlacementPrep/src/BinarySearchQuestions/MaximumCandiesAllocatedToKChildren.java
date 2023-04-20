package BinarySearchQuestions;

import java.util.Scanner;

public class MaximumCandiesAllocatedToKChildren {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumCandies(arr, k));
    }

    public static int maximumCandies(int[] candies, long k) {
        int n = candies.length;
        long max = candies[0], maxSum = 0; // non-negative integers in candies
        for (int x : candies) {
            max = Math.max(max, x);
            maxSum += x;
        }

        if (k > maxSum) return 0;

        long low = 1, high = max;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(candies, mid, k)) {
                ans = mid;
                low = mid + 1; //maximize
            } else {
                high = mid - 1;
            }
        }
        return (int) ans;
    }

    private static boolean isPossible(int[] candies, long mid, long k) {
        long sum = 0;
        for (int num : candies) {
            sum += (num / mid);
        }
        return sum >= k;
    }
}
