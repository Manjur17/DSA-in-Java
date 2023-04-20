package BinarySearchTree;

public class RangeSumBST {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) return 0;

        int sum = 0;

        if (root.val >= low && root.val <= high) {
            sum += root.val;  // count root in.
        }

        if (root.val > low) {
            sum += rangeSumBST(root.left, low, high); // left child is a possible candidate.
        }

        if (root.val < high) {
            sum += rangeSumBST(root.right, low, high);  // right child is a possible candidate.
        }

        return sum;
    }
}
