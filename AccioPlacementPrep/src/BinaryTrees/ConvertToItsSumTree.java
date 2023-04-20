package BinaryTrees;

//https://practice.geeksforgeeks.org/problems/transform-to-sum-tree/1

public class ConvertToItsSumTree {
    public static TreeNode convertToSumTree(TreeNode root) {
        if (root == null) return null;
        helper(root);
        return root;
    }

    public static int helper(TreeNode root) {
        if (root == null) return 0;

        if (root.left == null && root.right == null) {
            int val = root.val;
            root.val = 0;
            return val;
        }

        int left = helper(root.left);
        int right = helper(root.right);

        int temp = root.val;
        root.val = left + right;

        return temp + root.val;
    }
}
