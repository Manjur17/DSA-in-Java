package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElementCircularArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = nextGreaterElements(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums[i % n]) {
                st.pop();
            }

            ans[i % n] = st.empty() ? -1 : st.peek();

            st.push(nums[i % n]);
        }

        return ans;
    }
}
