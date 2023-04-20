package BinarySearchTree;

import java.util.*;

public class PrintLeafNodesFromPreorderTraversal {
    public int[] leafNodes(int[] arr, int n) {
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!st.isEmpty() && st.peek() < arr[i]) {
                int add = st.pop();
                int count = 1;
                while (!st.isEmpty() && st.peek() < arr[i]) {
                    count++;
                    st.pop();
                }
                if (count >= 2)
                    list.add(add);
            }

            st.add(arr[i]);
        }

        if (!st.isEmpty())
            list.add(st.pop());

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            ans[i] = list.get(i);

        return ans;
    }
}
