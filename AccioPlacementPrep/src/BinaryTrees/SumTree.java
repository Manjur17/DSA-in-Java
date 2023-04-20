package BinaryTrees;

public class SumTree {
    // for every node X in the tree other than the leaves,
    // its value is equal to the sum of its left subtree's value and its right subtree's value.
    boolean isSumTree(TreeNode root) {
        return helper(root) != -1;
    }

    //similar to Balanced Binary Tree
    private int helper(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        if (left == -1 || right == -1 || left + right != root.val)
            return -1;

        return root.val + left + right;
    }
}
