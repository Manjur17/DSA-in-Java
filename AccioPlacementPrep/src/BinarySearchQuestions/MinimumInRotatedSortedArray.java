package BinarySearchQuestions;

import java.util.Scanner;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                //we are the in the first part, and we need to search min in the 2nd part
                low = mid + 1;
            } else {
                high = mid; //one possible answer and if high becomes > low then this is the index of min element
                /*
                ans = Math.min(ans,arr[mid])
                high = mid -1;
                */
            }
        }
        return nums[low];  //or high
    }

}
