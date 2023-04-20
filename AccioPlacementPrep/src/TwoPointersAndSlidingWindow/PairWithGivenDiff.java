package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class PairWithGivenDiff {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(diffPossible(arr, target));
    }

    public static int diffPossible(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int i = 0, j = 1;
        while (i < n && j < n) {
            if (arr[j] - arr[i] == target) {
                return 1;
            } else if (arr[j] - arr[i] < target) {
                j++;
            } else {
                i++;
            }
            if (i == j) {
                j++;
            }
        }

        return 0;
    }
}
