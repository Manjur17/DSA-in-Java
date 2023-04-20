package BinaryTrees;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.left != null) {
            if (root.left.left == null && root.left.right == null) {
                sum += root.left.val;
            }
        }

        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }

    public int sumOfLeftLeavesII(TreeNode root) {
        return findSum(root, false);
    }

    private int findSum(TreeNode root, boolean isLeft) {
        if (root == null) return 0;

        int sum = 0;

        if (root.left == null && root.right == null && isLeft) {
            sum += root.val;
        }

        sum += findSum(root.left, true);
        sum += findSum(root.right, false);

        return sum;
    }
}
