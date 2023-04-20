package BinarySearchTree;

//Minimum Distance Between BST Nodes -> same ques
public class MinimumAbsoluteDifferenceBST {
    int min = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return min;
    }

    public void helper(TreeNode root) {
        if (root == null) return;

        helper(root.left);

        if (prev != null) {
            min = Math.min(min, root.val - prev.val);
        }
        prev = root;

        helper(root.right);

    }
}
