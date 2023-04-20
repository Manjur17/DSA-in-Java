package Arrays;

import java.util.Scanner;

public class MaximumConsecutive1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maximumConsecutive(arr));
    }

    private static int maximumConsecutive(int[] arr) {
        int res = 0, count = 0;
        for (int val : arr) {
            if (val == 1) {
                count++;
            } else {
                res = Math.max(res, count);
                count = 0;
            }
        }
        return res;
    }

}
