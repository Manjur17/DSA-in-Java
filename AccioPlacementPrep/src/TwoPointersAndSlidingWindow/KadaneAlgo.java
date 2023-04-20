package TwoPointersAndSlidingWindow;

import java.util.ArrayList;

public class KadaneAlgo {
    public static int maxSubArray(int[] nums, ArrayList<Integer> subarray) {
        int maxSum = Integer.MIN_VALUE, currSum = 0;
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum > maxSum) {
                subarray.clear();
                maxSum = currSum;
                subarray.add(index);
                subarray.add(i);
            }
            if (currSum < 0) {
                currSum = 0;
                index = i + 1;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        ArrayList<Integer> subarray = new ArrayList<>();
        int sum = maxSubArray(arr, subarray);
        System.out.println("The longest subarray with maximum sum is " + sum);
        System.out.println("The subarray is ");

        for (int i = subarray.get(0); i <= subarray.get(subarray.size() - 1); i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
