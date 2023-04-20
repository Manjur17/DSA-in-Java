package Stack;

import java.util.Stack;

public class TheMostCompetitiveSubsequence {
    public int[] mostCompetitive(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }
        return removeKDigits(nums, nums.length - k);
    }

    public static int[] removeKDigits(int[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            while (!st.empty() && k > 0 && st.peek() > val) {
                st.pop();
                k--;
            }
            st.push(val);
        }
        while (!st.empty() && k > 0) {
            st.pop();
            k--;
        }

        int[] ans = new int[st.size()];
        int j = ans.length - 1;
        while (!st.isEmpty()) {
            ans[j--] = st.pop();
        }

        return ans;
    }
}
