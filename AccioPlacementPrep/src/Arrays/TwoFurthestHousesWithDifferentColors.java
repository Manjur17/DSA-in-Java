package Arrays;

import java.util.Scanner;

public class TwoFurthestHousesWithDifferentColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxDistance(arr, n));
    }

    public static int maxDistance(int[] colors, int n) {
        int val = colors[n - 1];
        int res = n - 1;
        for (int j = 0; j < colors.length; j++) {
            if (colors[j] != val) {
                res = res - j;
                break;
            }
        }
        val = colors[0];
        int res2 = 0;
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != val) {
                res2 = j;
                break;
            }
        }
        int ans = Math.max(res, res2);
        return ans;
    }
}
