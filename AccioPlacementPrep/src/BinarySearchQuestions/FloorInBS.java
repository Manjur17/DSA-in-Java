package BinarySearchQuestions;

import java.util.Scanner;

public class FloorInBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findFloor(arr, x));
    }

    static int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > x)
                high = mid - 1;
        }
        return ans;
    }
}
