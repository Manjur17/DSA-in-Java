package SeachingAndSorting;

import java.util.*;

public class MinimumSwapsToSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minSwaps(arr));
    }

    public static int minSwaps(int[] arr) {
        int n = arr.length;
        int[][] pair = new int[n][2];
        for (int i = 0; i < arr.length; i++) {
            pair[i][0] = arr[i];
            pair[i][1] = i;
        }
        Arrays.sort(pair, (a, b) -> a[0] - b[0]);
        int swaps = 0, i = 0;

        while (i < n) {
            int index = pair[i][1];

            if (i != index) {
                swaps++;
                swap(pair, index, i);
            } else {
                i++;
            }
        }
        return swaps;
    }

    private static void swap(int[][] pair, int i, int j) {
        int value = pair[i][0];
        int index = pair[i][1];
        pair[i][0] = pair[j][0];
        pair[i][1] = pair[j][1];
        pair[j][0] = value;
        pair[j][1] = index;
    }
}
