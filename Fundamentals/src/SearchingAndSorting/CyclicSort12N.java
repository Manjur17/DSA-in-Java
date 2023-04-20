package SearchingAndSorting;

import java.util.Arrays;

public class CyclicSort12N {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};
        cyclicSort12N(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void cyclicSort12N(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                getSwap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    public static void getSwap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
