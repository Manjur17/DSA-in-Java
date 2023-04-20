package BinarySearchTree;

public class ValidateABST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }

    private boolean isValid(TreeNode root, long maxValue, long minValue) {
        if (root == null) return true;

        if (root.val >= maxValue || root.val <= minValue)
            return false;

        //range of max and min will be updated for further nodes
        return isValid(root.left, root.val, minValue) && isValid(root.right, maxValue, root.val);
    }
}
