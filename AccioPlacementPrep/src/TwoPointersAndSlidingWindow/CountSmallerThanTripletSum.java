package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class CountSmallerThanTripletSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(countTriplets(arr, n, target));
    }

    static long countTriplets(long[] arr, int n, int sum) {
        Arrays.sort(arr);
        long count = 0;

        for (int i = 0; i < n - 2; i++) {
            long target = sum - arr[i];
            int left = i + 1, right = n - 1;
            while (left < right) {
                if (arr[left] + arr[right]  < target) {
                    count += (right- left);
                    left++;
                }  else{
                    right--; //arr[left] + arr[right] >= target
                }
            }
        }
        return count;
    }
}
