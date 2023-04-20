package Recursion;

import java.util.Scanner;

public class Possible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.println("1");
            return;
        }
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = (i + 1);
        }
        System.out.println(solve(0, arr1, n, 0));
    }

    public static int solve(int idx, int[] arr, int n, int sum) {
        if (idx == arr.length) {
            if (sum == n) {
                return 1;
            }
            return 0;
        }
        sum += arr[idx];
        int l = solve(idx + 1, arr, n, sum);
        sum -= arr[idx];
        int r = solve(idx + 1, arr, n, sum);
        return l + r;
    }
}
