package TwoPointersAndSlidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountSubarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ans = solve(arr, k);
        System.out.println(ans);
    }

    public static int solve(int[] arr, int target) {
        int start = 0, end = 0, count = 0, sum = 0;
        int n = arr.length;

        while (end < n) {
            sum += arr[end];

            while (sum >= target) {
                sum -= arr[start];
                start++;
            }

            count += (end - start + 1);
            end++;
        }

        return count;
    }
}
