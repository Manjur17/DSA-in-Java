package BinarySearchQuestions;

import java.util.Scanner;

public class MinimumTimeToCompleteTrips {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minimumTime(arr, k));
    }

    public static long minimumTime(int[] nums, int totalTrips) {
        long low = 1;
        long high = (long) 1e14;
        long ans = -1;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isPossible(nums, mid, totalTrips)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, long mid, int totalTrips) {
        long sum = 0;
        for (int num : arr) {
            sum += (mid / num);
        }
        return sum >= totalTrips;

    }
}
