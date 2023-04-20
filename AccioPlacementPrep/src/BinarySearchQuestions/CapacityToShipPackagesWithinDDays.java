package BinarySearchQuestions;

import java.util.Scanner;

public class CapacityToShipPackagesWithinDDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int days = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(shipWithinDays(arr, days));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int max = weights[0], maxSum = 0; // non-negative integers in weights
        for (int x : weights) {
            max = Math.max(max, x);
            maxSum += x;
        }
        int low = max, high = maxSum;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int pieces = count(weights, days, mid);
            if (pieces <= days) {
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
        int sum = 0;
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
