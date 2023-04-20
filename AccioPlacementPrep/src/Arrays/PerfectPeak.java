package Arrays;

import java.util.*;

public class PerfectPeak {
    public int perfectPeakEfficient(int[] A) {
        int maxLeftEle = A[0];
        int minRightEle = A[A.length - 1];
        int j = A.length - 2;
        int peakPresent = 0;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        while (j > 0) {
            myMap.put(j, minRightEle);
            if (A[j] <= minRightEle) {
                minRightEle = A[j];
            }
            j--;
        }

        for (int i = 1; i < A.length - 1; i++) {
            if ((A[i] > maxLeftEle) && A[i] < myMap.get(i)) {
                peakPresent = 1;
                break;
            } else if (A[i] > maxLeftEle) {
                maxLeftEle = A[i];
            }
        }
        return peakPresent;
    }

    public int perfectPeak(int[] arr) {
        int n = arr.length;
        if (n < 3) return 0;
        int[] maxFromLeft = new int[n];
        int[] minFromRight = new int[n];
        int maxVal = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            maxVal = Math.max(arr[i - 1], maxVal);
            maxFromLeft[i] = maxVal;
        }
        int minval = Integer.MAX_VALUE;
        for (int i = n - 2; i >= 0; i--) {
            minval = Math.min(arr[i + 1], minval);
            minFromRight[i] = minval;
        }

        for (int i = 1; i < n - 1; i++) {
            if (maxFromLeft[i] < arr[i] && arr[i] < minFromRight[i])
                return 1;
        }
        return 0;

    }
}
