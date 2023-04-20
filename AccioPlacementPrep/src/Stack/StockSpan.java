package Stack;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = calculateSpan(arr, n);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] calculateSpan(int[] nums, int n) {
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();


        for (int i = 0; i < n; i++) {
            while (!st.empty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? i + 1 : i - st.peek();

            st.push(i);
        }

        return ans;
    }
}
