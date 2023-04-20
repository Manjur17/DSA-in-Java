package Stack;

import java.util.Stack;

public class NumberOfValidSubarrays {
    //The leftmost element of the sub array is not larger than other elements in the sub array.
    //sub array starting with min element
    public static int validSubarrays(int[] arr) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int count = 0;

        for (int i = n - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }

            count += s.isEmpty() ? n - i : s.peek() - i;

            s.push(i);
        }

        return count;
    }

    public static int validSubarraysII(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int count = 0;

        for (int num : nums) {
            while (!st.isEmpty() && st.peek() > num) {
                st.pop();
            }
            st.push(num);
            count += st.size();
        }

        return count;
    }
}
