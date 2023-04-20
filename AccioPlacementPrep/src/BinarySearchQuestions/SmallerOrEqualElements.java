package BinarySearchQuestions;

import java.util.Scanner;

public class SmallerOrEqualElements {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int ind = lastOccur(arr, k);
        System.out.println(ind + 1);
    }

    public static int lastOccur(int[] nums, int target) {
        int sI = 0, eI = nums.length - 1, ans = 0;

        while (sI <= eI) {

            int mid = sI + (eI - sI) / 2;

            if (nums[mid] <= target) {
                ans = mid + 1;
                sI = mid + 1;
            } else {
                eI = mid - 1;
            }
        }

        return ans;
    }

}
