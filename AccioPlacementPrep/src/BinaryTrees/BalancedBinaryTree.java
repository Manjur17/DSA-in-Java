package BinaryTrees;
//https://leetcode.com/problems/balanced-binary-tree/
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return findHeight(root) != -1;
    }

    private int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return 1 + Math.max(leftHeight, rightHeight);
    }
}
