package Recursion;

import java.util.Scanner;

public class SortTheHalfSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
    }

    private static void sort(int[] arr, int n) {
        int i = 0, j = 0, k = 0;
        int[] ans = new int[n];
        for (; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                j = i + 1;
                break;
            }
        }
        int half = j;
        i = 0;
        while (i < half && j < n) {
            if (arr[i] < arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }
        while (i < half) {
            ans[k++] = arr[i++];
        }
        while (j < n) {
            ans[k++] = arr[j++];
        }
        for (int m = 0; m < n; m++) {
            System.out.print(ans[m] + " ");
        }
    }
}
