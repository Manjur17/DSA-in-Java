package BinarySearchQuestions;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(searchInsert(arr, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int sI = 0, eI = nums.length - 1;

        while (sI <= eI) {

            int mid = sI + (eI - sI) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                sI = mid + 1;
            } else {
                eI = mid - 1;
            }
        }

        return sI;
    }
}
