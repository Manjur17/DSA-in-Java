package BinarySearchQuestions;

import java.util.Scanner;

public class CeilingInBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(ceilingInSortedArray(n, x, arr));
    }

    public static int ceilingInSortedArray(int n, int x, int[] arr) {
        int low = 0, high = n - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] < x)
                low = mid + 1;
        }
        return ans;
    }
}
