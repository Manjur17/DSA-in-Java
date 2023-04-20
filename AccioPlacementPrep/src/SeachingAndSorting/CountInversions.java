package SeachingAndSorting;

import java.util.Scanner;

public class CountInversions {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(inversionCount(arr, n));

    }

    static int inversionCount(int[] arr, int n) {
        return mergeSort(arr, 0, n - 1);
    }

    static int mergeSort(int[] arr, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return 0;
        }
        int count = 0;
        int mid = startIndex + (endIndex - startIndex) / 2;

        count += mergeSort(arr, startIndex, mid);
        count += mergeSort(arr, mid + 1, endIndex);
        count += merge(arr, startIndex, mid, endIndex);
        return count;
    }

    static int merge(int[] arr, int startIndex, int mid, int endIndex) {
        int range = (endIndex - startIndex + 1);
        int[] ans = new int[range];
        int i = startIndex, j = mid + 1, k = 0;
        int invCount = 0;
        while (i <= mid && j <= endIndex) {
            if (arr[i] <= arr[j]) {
                ans[k++] = arr[i++];
            } else {
                //arr[i] > arr[j] -> we have inversions here
                ans[k++] = arr[j++];
                invCount += (mid - i) + 1;
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

        return invCount;
    }
}
