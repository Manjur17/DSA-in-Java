package BitManipulation;

import java.util.Scanner;

public class BitDifferenceAllPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        System.out.println(countBits(n, arr));
    }

    static int countBits(int n, long[] arr) {
        long ans = 0;
        for (int i = 0; i < 32; i++) {
            long countOn = 0;
            //for every val in arr count set and unset bits
            //at every position
            for (long val : arr) {
                if ((val & (1 << i)) != 0) {
                    countOn++;
                }
            }
            long countOff = n - countOn;
            ans += (countOff * countOn * 2);
        }
        ans %= 1000000007;
        return (int) ans;
    }
}
