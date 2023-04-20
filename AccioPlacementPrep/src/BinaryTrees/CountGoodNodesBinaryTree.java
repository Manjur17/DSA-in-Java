package BinaryTrees;

public class CountGoodNodesBinaryTree {
    public int goodNodes(TreeNode root) {
        int[] count = {0};
        helper(root, Integer.MIN_VALUE, count);
        return count[0];
    }

    private void helper(TreeNode root, int max, int[] count) {
        if (root == null) return;

        if (root.val >= max) {
            count[0]++;
            max = root.val;
        }

        helper(root.left, max, count);
        helper(root.right, max, count);
    }

    private int helper(TreeNode root, int max) {
        if (root == null) return 0;

        int count = 0;
        if (root.val >= max) {
            count++;
            max = root.val;
        }

        count += helper(root.left, max);
        count += helper(root.right, max);
        return count;
    }
}
