package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = dailyTemperatures(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] dailyTemperatures(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.empty() && nums[i] >= nums[st.peek()]) {
                st.pop();
            }

            ans[i] = st.empty() ? 0 : st.peek() - i;

            st.push(i);
        }

        return ans;
    }
}
