package BitManipulation;

import java.util.Arrays;

public class SingleNumberII {
    public int singleNumberII(int[] arr) {
        // basically we are checking the element of the array for every mask value upto 32 bits...
        // if the element will be same then the bits will result in more than 0 and we will count that...

        int ans = 0;
        for (int i = 0; i < 32; i++) {

            int mask = 1 << i;
            int count = 0;

            for (int n : arr) {
                if ((n & mask) != 0) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans = ans | mask; //set the last bits [......1,1,1,1] like this
            }
        }
        return ans;

        // Time Complexity : O(N) time complexity will be O(N) because the outer loop is running for constant time i.e. for only 32 times...
        // Space Complexity : O(1)
    }

    public int singleNumber(int[] nums) {
        //Approach 1: Sort the array , check if nums[i]==nums[i+1] increase i=i+3,else return nums[i].TC-O(NLogN + N)
        Arrays.sort(nums);
        int n = nums.length;
        //EDGE CASE -> when unique element appears at last position
        int i = 0;
        while (i < n - 1) {
            if (nums[i] == nums[i + 1]) {
                i += 3;
            } else {
                return nums[i];
            }
        }

        return nums[i];
    }
}
