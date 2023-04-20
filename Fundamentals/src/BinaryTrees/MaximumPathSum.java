package BinaryTrees;

public class MaximumPathSum {
    public int maxPathSum(TreeNode root) {
        int[] maxVal = new int[1];
        maxVal[0] = Integer.MIN_VALUE;
        maxPathDown(root,maxVal);
        return maxVal[0];
    }

    private int maxPathDown(TreeNode root, int[] maxVal) {
        if (root == null) {
            return 0;
        }
        int leftSum = Math.max(0,maxPathDown(root.left, maxVal));
        int rightSum = Math.max(0,maxPathDown(root.right, maxVal));
        maxVal[0] = Math.max(maxVal[0], leftSum + rightSum + root.val);
        return root.val + Math.max(leftSum, rightSum);
    }
}
