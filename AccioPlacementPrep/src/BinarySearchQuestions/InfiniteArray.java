package BinarySearchQuestions;

import java.util.Scanner;

public class InfiniteArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findIndex(arr, target));
    }

    public static int findIndex(int[] arr, int target) {
        int low = 0;
        int high = 1;
        while (target > arr[high]) {
            //condition for target not lying in the range
            low = high + 1;
            high = high + (high - low + 1) * 2;

        }
        return search(arr, target, low, high);
    }

    public static int search(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }
}
