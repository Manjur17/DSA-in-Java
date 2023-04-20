package TwoPointersAndSlidingWindow;

import java.util.Arrays;
import java.util.Scanner;

public class FlipBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        String s = sc.nextLine();
        int[] ans = flip(s);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxOnes(arr, n));
    }

    public static int[] flip(String s) {
        int currSum = 0;
        int maxSum = 0;
        int left = 0, right = 0;
        int[] ans = new int[2];
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            int val = -1; //A.charAt(i) == '1'
            if (s.charAt(i) == '0') {
                val = 1;
                flag = false; // we have encountered at least one 0
            }
            currSum += val;

            if (currSum > maxSum) {
                maxSum = currSum;
                right = i;
                ans[0] = left + 1;
                ans[1] = right + 1;
            }

            if (currSum < 0) {
                currSum = 0;
                left = i + 1; //leave that sub array
            }
        }
        if (flag) {
            return new int[]{};
        }
        return ans;
    }

    public static int maxOnes(int[] a, int n) {
        int currsum = 0;
        int maxsum = 0;
        for (int i = 0; i < n; i++) {
            int val = a[i] == 1 ? -1 : 1;
            currsum += val;
            maxsum = Math.max(currsum, maxsum);
            if (currsum < 0) {
                currsum = 0;
            }
        }
        return maxsum;
    }
}
