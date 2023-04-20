package BinarySearchTree;

class NodeValue {
    public int maxNode, minNode, maxSize;

    NodeValue(int minNode, int maxNode, int maxSize) {
        this.maxNode = maxNode;
        this.minNode = minNode;
        this.maxSize = maxSize;
    }
}

public class LargestBSTInBinaryTree {
    public int largestBSTSubtree(TreeNode root) {
        return largestBSTSubtreeHelper(root).maxSize;
    }

    private NodeValue largestBSTSubtreeHelper(TreeNode root) {
        // An empty tree is a BST of size 0.
        if (root == null) {
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        // Get values from left and right subtree of current tree.
        NodeValue left = largestBSTSubtreeHelper(root.left);
        NodeValue right = largestBSTSubtreeHelper(root.right);

        // Current node is greater than max in left AND smaller than min in right, it is a BST.
        if (left.maxNode < root.val && root.val < right.minNode) {
            // It is a BST.
            return new NodeValue(Math.min(root.val, left.minNode), Math.max(root.val, right.maxNode), left.maxSize + right.maxSize + 1);
        }

        // Otherwise, return [-inf, inf] so that parent can't be valid BST
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxSize, right.maxSize));
    }

    static int largestBstBrute(TreeNode root) {
        if (root == null) return 0;
        if (isBst(root, Integer.MIN_VALUE, Integer.MAX_VALUE)) {
            return bstSize(root);
        }
        return Math.max(largestBstBrute(root.left), largestBstBrute(root.right));
    }

    static int bstSize(TreeNode root) {
        if (root == null) return 0;
        return 1 + bstSize(root.left) + bstSize(root.right);
    }

    static boolean isBst(TreeNode root, int low, int high) {
        if (root == null) return true;
        if (low >= root.val || root.val >= high) return false;
        return isBst(root.left, low, root.val) && isBst(root.right, root.val, high);
    }
}
