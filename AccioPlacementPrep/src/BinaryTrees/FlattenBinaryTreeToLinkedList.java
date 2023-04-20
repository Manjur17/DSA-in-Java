package BinaryTrees;

import java.util.Stack;

public class FlattenBinaryTreeToLinkedList {
    public void flattenMorris(TreeNode root) {
        if (root == null) return;

        TreeNode curr = root;

        while (curr != null) {

            if (curr.left != null) {
                TreeNode prev = curr.left;

                while (prev.right != null)
                    prev = prev.right;

                prev.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }


    public void flatten2(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        flattenHelper(root, st);
    }

    public void flattenHelper(TreeNode root, Stack<TreeNode> st) {

        st.push(root);

        while (!st.isEmpty() && root != null) {

            TreeNode curr = st.pop();

            if (curr.right != null) st.push(curr.right);
            if (curr.left != null) st.push(curr.left);

            if (!st.isEmpty()) curr.right = st.peek();

            curr.left = null;
        }
    }
}
