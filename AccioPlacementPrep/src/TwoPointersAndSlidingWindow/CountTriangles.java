package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class CountTriangles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = findNumberOfTriangles(arr, n);
        System.out.println(ans);
    }

    static int findNumberOfTriangles(int[] arr, int n) {
        //O(n^2 + nlogn) == O(n^2)
        Arrays.sort(arr);
        int ans = 0;
        for (int i = n - 1; i >= 2; i--) {
            ans += count(arr, i, arr[i]);
        }
        return ans;
    }

    private static int count(int[] arr, int index, int c) {
        int count = 0;
        int i = 0, j = index - 1;
        while (i < j) {
            if (arr[i] + arr[j] > c) {
                count += (j - i);
                j--;
            } else {
                i++; //arr[i] + arr[j] <= c
            }
        }
        return count;
    }

    public int nTriang(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        long ans = 0;

        for (int index = n - 1; index >= 2; index--) {
            int i = 0, j = index - 1, c = arr[index];
            while (i < j) {
                if (arr[i] + arr[j] > c) {
                    ans += (j - i);
                    j--;
                } else
                    i++;
            }
        }
        ans %= 1000000007;
        return (int) ans;
    }
}
