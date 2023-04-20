package BinarySearchQuestions;

import java.util.Scanner;

public class KevinAndHisFruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find_height(arr, n, m));
    }

    static int find_height(int[] arr, int n, int m) {
        int low = 0;
        int high = (int) 1e4;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, mid, m)) {
                ans = mid;
                low = mid + 1; //maximize
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int mid, int m) {
        int sum = 0;
        for (int x : arr) {
            if (x > mid)
                sum += (x - mid);
        }
        return sum >= m;
    }
}
