package BinarySearchQuestions;

import java.util.Arrays;

public class DistanceValueBetweenTwoArrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int count = 0;

        for (int j : arr1) {
            if (solve(arr2, j, d)) {
                count++;
            }
        }

        return count;
    }

    public boolean solve(int[] arr, int i, int d) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (Math.abs(arr[mid] - i) <= d) {
                return false;
            } else if (arr[mid] > i) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return true;
    }
}
