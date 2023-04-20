package BinarySearchTree;

public class ClosestElementInBST {
    static int minDiff(TreeNode root, int key) {
        int floor = -1, ceil = -1;

        while (root != null) {

            if (root.val == key) return 0;

            if (root.val < key) {
                floor = root.val;
                root = root.right;
            } else {
                ceil = root.val;
                root = root.left;
            }
        }

        if (ceil == -1) return key - floor;
        if (floor == -1) return ceil - key;

        return Math.min(ceil - key, key - floor);
    }
}
