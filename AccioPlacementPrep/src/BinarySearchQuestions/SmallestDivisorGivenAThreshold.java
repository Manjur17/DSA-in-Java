package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestDivisorGivenAThreshold {
    public static void main(String[] args) {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int threshold = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(smallestDivisor(arr, threshold));
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        int ans = 0, max = -1;
        for (int x : nums) {
            max = Math.max(x, max);
        }

        int low = 1, high = max;
//        int high = Arrays.stream(nums).max().getAsInt();
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int m = isPossible(nums, mid, threshold);
            if (m <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                // m > threshold
                low = mid + 1;
            }
        }
        return ans;
    }

    private static int isPossible(int[] nums, int m, int threshold) {
        int sum = 0;
        for (int x : nums) {
            sum +=  Math.ceil((double) x / m);
        }
        return sum;
    }
}
