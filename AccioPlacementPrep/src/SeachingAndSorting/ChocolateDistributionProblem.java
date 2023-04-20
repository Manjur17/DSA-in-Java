package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(findMinDiff(arr, n, m));
    }

    public static long findMinDiff(int[] arr, int n, int m) {
        Arrays.sort(arr);
        long res = arr[m - 1] - arr[0];

        for (int i = m; i < n; i++) {
            res = Math.min(res, arr[i] - arr[i - m + 1]);
        }

        return res;
    }
}
