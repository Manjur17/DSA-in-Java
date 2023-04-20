package BinarySearchQuestions;

import java.util.*;

public class HIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(hIndex(arr));
        System.out.println(hIndexBetter(arr));
    }

    public static int hIndexBetter(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == n - mid) {
                return n - mid;
            } else if (arr[mid] > n - mid) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return n - low;
    }

    public static int hIndex(int[] citations) {
        int low = 0;
        int high = citations.length;

        int ans = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(citations, mid)) {
                ans = mid;
                low = mid + 1; //maximize
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int mid) {
        int count = 0;
        for (int x : arr) {
            if (x >= mid)
                count++;
        }
        return count >= mid;
    }
}
