package BinarySearchQuestions;

import java.util.Arrays;

public class SpecialArray {
    //Special Array With X Elements Greater Than or Equal X
    public int specialArraySorting(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            if (nums[i] >= n - i) {

                if (i > 0 && nums[i - 1] >= n - i) {

                    continue;
                }

                return n - i;
            }
        }

        return -1;
    }

    public int specialArray(int[] nums) {
        int low = 0;
        int high = nums[0];
        for (int val : nums) {
            high = Math.max(val, high);
        }
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            int m = count(nums, mid);
            if (m == mid) {
                return mid;
            } else if (m < mid) {
                high = mid - 1;
            } else {
                low = mid + 1; //m > mid
            }
        }
        return ans;
    }

    public int count(int[] nums, int mid) {
        int count = 0;
        for (int num : nums) {
            if (num >= mid) {
                count++;
            }
        }
        return count;
    }
}
