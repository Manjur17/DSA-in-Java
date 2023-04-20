package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class MaximumOnesAfterModification {
    public static void main(String[] args) throws java.lang.Exception {
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

    public static int solve(int[] arr, int k) {
        int n = arr.length;
        int i = 0, j = 0, flips = 0, ans = 0;
        while (j < n) {
            if (arr[j] == 0) flips++;

            while (flips > k) {
                if (arr[i] == 0) flips--;
                i++;
            }
            ans = Math.max(ans, (j - i + 1));
            j++;
        }

        return ans;
    }
}
