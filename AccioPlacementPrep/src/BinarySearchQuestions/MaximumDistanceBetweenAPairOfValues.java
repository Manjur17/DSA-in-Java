package BinarySearchQuestions;

import java.util.Scanner;

public class MaximumDistanceBetweenAPairOfValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(maxDistance(arr1, arr2));
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int ans = 0;

        for (int i = 0; i < nums1.length; i++) {
            ans = Math.max(ans, find(nums2, nums1[i], i));
        }
        return ans;
    }

    static int find(int[] arr, int n, int i) {
        int diff = 0;
        int start = i;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < n)
                end = mid - 1;
            else {
                //find arr[mid] >= n
                diff = mid - i;
                start = mid + 1;
            }
        }
        return diff;
    }
}
