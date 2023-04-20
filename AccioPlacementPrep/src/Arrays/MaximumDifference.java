package Arrays;

import java.util.Scanner;

public class MaximumDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumDifference(arr));
    }

    public static int maximumDifference(int[] arr) {
        int n = arr.length;
        int ans = -1;
        int minVal = arr[0];
        for (int j = 1; j < n; j++) {
            ans = Math.max(ans, arr[j] - minVal);
            minVal = Math.min(arr[j], minVal);
        }

        if (ans <= 0)
            return -1;

        return ans;
    }
}
