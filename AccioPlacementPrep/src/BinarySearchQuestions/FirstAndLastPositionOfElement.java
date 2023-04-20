package BinarySearchQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class FirstAndLastPositionOfElement {
    public static void main(String[] args) throws java.lang.Exception {
        //your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(searchRange(arr,target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstOccur(nums, target);
        ans[1] = lastOccur(nums, target);
        return ans;
    }

    public static int firstOccur(int[] nums, int target) {
        int sI = 0, eI = nums.length - 1, ans = -1;

        while (sI <= eI) {

            int mid = sI + (eI - sI) / 2;

            if (nums[mid] > target) {
                eI = mid - 1;
            } else if (nums[mid] < target) {
                sI = mid + 1;
            } else {
                ans = mid; //possible first index
                eI = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccur(int[] nums, int target) {
        int sI = 0, eI = nums.length - 1, ans = -1;

        while (sI <= eI) {

            int mid = sI + (eI - sI) / 2;

            if (nums[mid] > target) {
                eI = mid - 1;
            } else if (nums[mid] < target) {
                sI = mid + 1;
            } else {
                ans = mid; //possible last index
                sI = mid + 1;
            }
        }

        return ans;
    }
}
