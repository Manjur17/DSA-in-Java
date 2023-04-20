package Recursion;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int num = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int sum = 0;
            int ans = solve(arr, sum, 0);
            System.out.println("Case " + num + ": " + ans);
            int ans2 = solve2(arr, 0);
            System.out.println("Case " + num + ": " + ans2);
            num++;
        }
    }

    public static int solve(int[] arr, int sum, int index) {
        if (index == arr.length) {
            return sum;
        }
        sum += arr[index];
        return solve(arr, sum, index + 1);
    }

    public static int solve2(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        }

        return arr[index] + solve2(arr, index + 1);
    }
}
