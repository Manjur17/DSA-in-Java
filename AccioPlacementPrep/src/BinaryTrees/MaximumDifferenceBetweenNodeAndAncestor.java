package BinaryTrees;

//https://practice.geeksforgeeks.org/problems/maximum-difference-between-node-and-its-ancestor/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
//try GFG version

public class MaximumDifferenceBetweenNodeAndAncestor {
    int ans = 0;

    public int maxAncestorDiff(TreeNode root) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        helper(root, max, min);
        return ans;
    }

    public void helper(TreeNode root, int max, int min) {
        if (root == null) {
            return;
        }

        if (root.val > max) {
            max = root.val;
        }

        if (root.val < min) {
            min = root.val;
        }


        if (root.left == null && root.right == null) {
            ans = Math.max(ans, Math.abs(max - min));
            return;
        }

        helper(root.left, max, min);
        helper(root.right, max, min);

    }
}
