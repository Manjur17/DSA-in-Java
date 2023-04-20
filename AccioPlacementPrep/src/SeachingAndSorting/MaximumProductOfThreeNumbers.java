package SeachingAndSorting;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return -1;
        }

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Return the maximum of product of last three
        // elements and product of first two elements
        // and last element
        return Math.max(arr[0] * arr[1] * arr[n - 1], arr[n - 1] * arr[n - 2] * arr[n - 3]);
    }
}
