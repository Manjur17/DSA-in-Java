package BinaryTrees;

public class PathSum {
    public boolean helper(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        targetSum -= root.val;
        if (root.left == null && root.right == null && targetSum == 0)
            return true;
        if (root.left == null)
            return helper(root.right, targetSum);
        if (root.right == null)
            return helper(root.left, targetSum);

        return (helper(root.left, targetSum) || helper(root.right, targetSum));
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return helper(root, targetSum);
    }

    public boolean hasPathSumI(TreeNode root, int targetSum) {
        if (root == null) return false;
        int sum = 0;
        return helper(root, targetSum, sum);
    }

    boolean helper(TreeNode root, int targetSum, int sum) {
        if (root == null)
            return false;

        //check for leaf node
        if (root.left == null && root.right == null) {
            return sum + root.val == targetSum;
        }

        boolean left = helper(root.left, targetSum, sum + root.val);
        boolean right = helper(root.right, targetSum, sum + root.val);

        return left || right;

    }
}
