package SeachingAndSorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        mergeSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        }

        int mid = startIndex + (endIndex - startIndex) / 2;

        mergeSort(arr, startIndex, mid);
        mergeSort(arr, mid + 1, endIndex);
        merge(arr, startIndex, mid, endIndex);
    }

    static void merge(int[] arr, int startIndex, int mid, int endIndex) {
        int[] ans = new int[endIndex - startIndex + 1];
        int i = startIndex, j = mid + 1, k = 0;
        while (i <= mid && j <= endIndex) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                ans[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            ans[k++] = arr[i++];
        }
        while (j <= endIndex) {
            ans[k++] = arr[j++];
        }

        for (int ind = 0; ind < ans.length; ind++) {
            arr[startIndex + ind] = ans[ind];
        }
    }
}
