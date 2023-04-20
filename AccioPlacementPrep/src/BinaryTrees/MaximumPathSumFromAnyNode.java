package BinaryTrees;

public class MaximumPathSumFromAnyNode {
    public int maxPathSum(TreeNode root) {
        int[] maxSum = {Integer.MIN_VALUE};
        maxPathSum(root, maxSum);
        return maxSum[0];
    }

    /*
        Going to each node
        finding max path for each node
        if current maxPathSum > maxSum update the maxSum
    */

    private int maxPathSum(TreeNode root, int[] maxSum) {
        if (root == null) return 0;

        int leftSum = Math.max(0, maxPathSum(root.left, maxSum));
        int rightSum = Math.max(0, maxPathSum(root.right, maxSum));

        maxSum[0] = Math.max(maxSum[0], leftSum + rightSum + root.val);

        return root.val + Math.max(leftSum, rightSum);
    }
}
