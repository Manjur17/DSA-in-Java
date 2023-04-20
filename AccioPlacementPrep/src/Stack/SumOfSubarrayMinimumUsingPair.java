package Stack;

import java.util.Scanner;
import java.util.Stack;


public class SumOfSubarrayMinimumUsingPair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(sumSubarrayMins(arr, n));
    }

    static int sumSubarrayMins(int[] arr, int n) {
        int[] left = NSL(arr, n);
        int[] right = NSR(arr, n);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (arr[i] * (((long) left[i] * right[i]) % 1000000007) % 1000000007);
            sum %= 1000000007;
        }
        return (int) sum;
    }

    public static int[] NSL(int[] arr, int n) {
        Stack<Pair> s1 = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; ++i) {
            int cnt = 1;
            while (!s1.isEmpty() && (s1.peek().first) > arr[i]) {
                cnt += s1.peek().second;
                s1.pop();
            }

            s1.push(new Pair(arr[i], cnt));
            ans[i] = cnt;
        }
        return ans;
    }

    public static int[] NSR(int[] arr, int n) {
        Stack<Pair> s2 = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; --i) {
            int cnt = 1;
            while (!s2.isEmpty() && (s2.peek().first) >= arr[i]) {
                cnt += s2.peek().second;
                s2.pop();
            }

            s2.push(new Pair(arr[i], cnt));
            ans[i] = cnt;
        }
        return ans;
    }
}
