package Stack;

import java.util.*;

public class SumOfSubarryMinimums {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(sumSubarrayMins(arr));
    }

    public static int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] left = nsl(arr, n);
        int[] right = nsr(arr, n);
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += ((arr[i] * ((long) left[i] * right[i]) % 1000000007 )% 1000000007);
            sum %= 1000000007;
        }
        return (int) sum;
    }

    public static int[] nsl(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && arr[i] < arr[s.peek()]) {
                s.pop();
            }

            ans[i] = s.isEmpty() ? i - (-1) : i - s.peek();

            s.push(i);
        }
        return ans;
    }

    public static int[] nsr(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            ans[i] = s.isEmpty() ? n - i : s.peek() - i;

            s.push(i);
        }
        return ans;
    }
}
