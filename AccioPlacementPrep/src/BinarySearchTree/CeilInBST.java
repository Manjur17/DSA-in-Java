package BinarySearchTree;

public class CeilInBST {
    int findCeil(TreeNode root, int key) {
        if (root == null) return -1;

        int ceil = -1;

        while (root != null) {
            if (root.val == key) return root.val;

            if (root.val > key) {
                ceil = root.val;
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return ceil;
    }
}
