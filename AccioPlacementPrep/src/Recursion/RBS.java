package Recursion;

import java.util.Scanner;

public class RBS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(search(arr, target));
    }

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] arr, int start, int end, int target) {
        if (start > end)
            return -1;

        int mid = (start + end) / 2;
        if (arr[mid] == target)
            return mid;

        if (arr[start] <= arr[mid]) {

            if (target >= arr[start] && target <= arr[mid])
                return search(arr, start, mid - 1, target);

            return search(arr, mid + 1, end, target);
        }


        if (target >= arr[mid] && target <= arr[end])
            return search(arr, mid + 1, end, target);

        return search(arr, start, mid - 1, target);
    }
}
