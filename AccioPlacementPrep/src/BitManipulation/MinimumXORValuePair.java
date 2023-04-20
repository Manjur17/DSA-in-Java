package BitManipulation;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumXORValuePair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(minxOrPair(n, arr));
    }

    static int minxOrPair(int N, int[] arr) {
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);
        //XOR of (immediate next) arr[i] ^ arr[i + 1]
        //is lesser than XOR of arr[i] ^ arr[i + 2/3/4/....n]
        //so no need to check for these ahead pairs
        for (int i = 0; i < N - 1; i++) {
            int xor = arr[i] ^ arr[i + 1];
            ans = Math.min(ans, xor);
        }
        return ans;
    }

    static int minXORBrute(int[] arr, int n) {
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                ans = Math.min(ans, arr[i] ^ arr[j]); // update minimum xor value if required
            }
        }
        return ans;
    }
}
