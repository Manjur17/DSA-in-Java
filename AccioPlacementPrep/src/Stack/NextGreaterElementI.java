package Stack;

import java.util.HashMap;
import java.util.Stack;

public class NextGreaterElementI {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[nums1.length];

        for (int i = nums2.length - 1; i >= 0; i--) {
            while (!st.empty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if (st.empty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
