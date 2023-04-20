package SeachingAndSorting;

import java.util.Arrays;

public class MinimumStepsToGetDesiredArray {
    /*
        First sort Array
        Create infinite loop until all elements are zero
        Decrement odd elements and answer++.
        Divide all elements by two and after the complete iteration answer++.
        We have sorted the array means when the last element is zero all elements must be zero.
        Return answer.
     */

    private static int countMinOperations(int[] arr, int n) {
        Arrays.sort(arr);
        int ans = 0;

        while (true) {
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    arr[i]--;
                    ans++;
                }

                if (arr[n - 1] == 0) break;
                arr[i] /= 2;
            }

            if (arr[n - 1] == 0) break;
            ans++;
        }

        return ans;
    }
}
