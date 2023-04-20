package SeachingAndSorting;

import java.util.Arrays;

public class MaximizeToys {
    static int toyCount(int n, int k, int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int x : arr) {
            k = k - x;

            if (k >= 0) count++;
            else break;
        }

        return count;
    }
}
