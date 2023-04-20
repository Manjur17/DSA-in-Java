package Arrays;

public class SumOf2Arrays {
    public static int[] findArraySum(int[] a, int n, int[] b, int m) {
        // Write your code here.
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
        int nD = (int) Math.log10(total) + 1;
        int[] ans = new int[nD];
        int k = nD - 1;
        while (total > 0) {
            ans[k--] = total % 10;
            total /= 10;
        }

        return ans;
    }
}
