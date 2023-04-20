package BinarySearchTree;

import java.util.Stack;

public class BSTIterator {
    private final Stack<TreeNode> st;

    public BSTIterator(TreeNode root) {
        st = new Stack<>();
        pushAll(root);
    }

    private void pushAll(TreeNode root) {
        while (root != null) {
            st.push(root);
            root = root.left;
        }
    }

    public int next() {
        TreeNode curr = st.pop();
        if (curr.right != null) pushAll(curr.right);
        return curr.val;
    }

    public boolean hasNext() {
        return !st.empty();
    }
}
