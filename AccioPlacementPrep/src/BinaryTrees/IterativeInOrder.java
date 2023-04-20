package BinaryTrees;

import java.util.*;

public class IterativeInOrder {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> st = new Stack<>();

        while (!st.isEmpty() || root != null) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            list.add(root.val);
            root = root.right;

        }

        return list;
    }
}
