package Maths;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] arr) {
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 2; i--) {
            if (arr[i - 2] + arr[i - 1] > arr[i]) {
                return arr[i - 2] + arr[i - 1] + arr[i];
            }
        }

        return 0;
    }
}
