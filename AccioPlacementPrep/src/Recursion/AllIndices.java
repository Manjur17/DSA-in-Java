package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = allIndices(arr, x, 0, 0);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] allIndices(int[] arr, int x, int idx, int count) {
        if (idx == arr.length) {
            return new int[count];
        }

        if (arr[idx] == x) {
            int[] ans = allIndices(arr, x, idx + 1, count + 1);
            ans[count] = idx;
            return ans;
        }
        int[] ans = allIndices(arr, x, idx + 1, count);
        return ans;
    }
}
