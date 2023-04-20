package Stack;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = largestRectangleArea(arr);
        System.out.println(ans);
    }

    public static long getMaxArea(long[] arr, long n) {
        // your code here
        Stack<Integer> st = new Stack<>();
        long maxA = 0;

        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                long height = arr[st.peek()];
                st.pop();
                long width = st.empty() ? i : (i - st.peek() - 1);
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }

        return maxA;
    }

    public int largestRectangleAreaEfficient(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = arr.length;
        for (int i = 0; i <= n; i++) {
            while (!st.empty() && (i == n || arr[st.peek()] >= arr[i])) {
                int height = arr[st.peek()]; // arr[i] is the NSR for arr[st.peek()]
                st.pop(); //now after popped the arr[st.peek()] is the NSL for height
                int width = st.empty() ? i : (i - st.peek() - 1);
                maxA = Math.max(maxA, width * height);
            }
            st.push(i);
        }
        return maxA;
    }

    public static int largestRectangleArea(int[] arr) {
        int n = arr.length;
        int[] nsl = NSL(arr);
        int[] nsr = NSR(arr);
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nsr[i] - nsl[i] - 1;
            maxArea = Math.max(maxArea, arr[i] * width);
        }
        return maxArea;
    }

    public static int[] NSR(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? n : st.peek();

            st.push(i);
        }

        return ans;
    }

    public static int[] NSL(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();

            st.push(i);
        }

        return ans;
    }
}
