package TwoPointersAndSlidingWindow;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }
        String ans = calc_Sum(arr1, n, arr2, m);
        System.out.println();
    }

    static String calc_Sum(int[] a, int n, int[] b, int m) {
        int i = n - 1, j = m - 1;
        int carry = 0;
        StringBuilder s = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;
            int val1 = i >= 0 ? a[i] : 0;
            int val2 = j >= 0 ? b[j] : 0;
            sum += carry + val1 + val2;
            carry = sum / 10;
            s.insert(0, sum % 10);
            i--;
            j--;
        }

        while (s.toString().startsWith("0")) {
            s.deleteCharAt(0);
        }
        return s.toString();
    }

    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        int total = 0;
        int i = n - 1, j = m - 1;
        int carry = 0;
        int exp = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = 0;
            int val1 = i >= 0 ? a[i] : 0;
            int val2 = j >= 0 ? b[j] : 0;
            sum += carry + val1 + val2;
            carry = sum / 10;
            total = total + (sum % 10 * (int) Math.pow(10, exp));
            exp++;
            i--;
            j--;
        }
        System.out.println(total);
        int nD = (int) Math.log10(total) + 1;
        System.out.println(nD);
        int[] ans = new int[nD];
        int k = nD - 1;
        while (total > 0) {
            ans[k--] = total % 10;
            total /= 10;
        }
        return ans;
    }
}
