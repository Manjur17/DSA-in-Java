package TwoPointersAndSlidingWindow;

public class MaximumProductSubarray {
    public int maxProduct(int[] arr) {
        int maxSoFar = arr[0], minSoFar = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int x = Math.max(arr[i], Math.max(arr[i] * maxSoFar, arr[i] * minSoFar));
            int y = Math.min(arr[i], Math.min(arr[i] * maxSoFar, arr[i] * minSoFar));

            maxSoFar = x;
            minSoFar = y;

            ans = Math.max(ans, maxSoFar);
        }

        return ans;
    }

    public int maxProductII(int[] nums) {
        int maxProd = Integer.MIN_VALUE, currProd = 1;

        for (int i = 0; i < nums.length; i++) {
            currProd *= nums[i];

            if (currProd > maxProd) {
                maxProd = currProd;
            }

            if (currProd == 0) {
                currProd = 1;
            }
        }

        currProd = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            currProd *= nums[i];

            if (currProd > maxProd) {
                maxProd = currProd;
            }

            if (currProd == 0) {
                currProd = 1;
            }
        }

        return maxProd;
    }
}
