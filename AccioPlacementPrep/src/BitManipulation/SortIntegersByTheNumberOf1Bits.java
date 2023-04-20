package BitManipulation;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        Integer[] a = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) a[i] = arr[i];

        Arrays.sort(a, (x, y) -> {
            if (Integer.bitCount(x) - Integer.bitCount(y) == 0) {
                //in case of two or more integers have the same number of 1's
                // you have to sort them in ascending order.
                return x - y;
            } else {
                return Integer.bitCount(x) - Integer.bitCount(y);
            }
        });

        for (int i = 0; i < arr.length; i++) arr[i] = a[i];
        return arr;

    }
}
