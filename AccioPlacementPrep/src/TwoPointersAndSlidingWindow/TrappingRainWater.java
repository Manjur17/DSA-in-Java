package TwoPointersAndSlidingWindow;

public class TrappingRainWater {
    public int trap(int[] arr, int n) {
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int ans = 0;
        //if (left >= right) there will be no bar to hold water
        while (left < right) {
            //check 1 -> There is someone on right to help the left bar to hold water
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    //this bar cannot hold water
                    leftMax = arr[left];
                } else {
                    //check 2 -> if for current a[left],there is someone on left to help the current left bar to hold water
                    ans += leftMax - arr[left]; // min(a[left],a[right]) - a[i]
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    //this bar cannot hold water
                    rightMax = arr[right];
                } else {
                    //check 2 -> if for current a[right],there is someone on right to help the current right bar to hold water
                    ans += rightMax - arr[right]; // min(a[left],a[right]) - a[i]
                }
                right--;
            }
        }
        return ans;
    }

    static int findWater(int[] arr) {
        int n = arr.length;

        int[] left = new int[n]; //prefix Max
        int[] right = new int[n]; //Suffix Max

        int res = 0;

        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }

        for (int i = 0; i < n; i++) {
            res += Math.min(left[i], right[i]) - arr[i];
        }

        return res;
    }

    public static int maxWaterBrute(int[] arr, int n) {
        int res = 0;

        // For every element of the array,except first and last element
        for (int i = 1; i < n - 1; i++) {

            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;
    }
}
