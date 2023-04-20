package BinaryTrees;

//https://practice.geeksforgeeks.org/problems/maximum-sum-leaf-to-root-path/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article

public class MaximumSumLeafToRootPath {
    public static int maxPathSum(TreeNode root) {
        if (root == null)
            return 0;

        if (root.left == null)
            return root.val + maxPathSum(root.right);
        if (root.right == null)
            return root.val + maxPathSum(root.left);

        int left = maxPathSum(root.left);
        int right = maxPathSum(root.right);

        return root.val + Math.max(left, right);
    }


}
