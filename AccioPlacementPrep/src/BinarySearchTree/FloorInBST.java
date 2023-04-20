package BinarySearchTree;

public class FloorInBST {
    int findFloor(TreeNode root, int key) {
        if (root == null) return -1;

        int floor = -1;

        while (root != null) {
            if (root.val == key) return root.val;

            if (root.val < key) {
                floor = root.val;
                root = root.right;
            } else {
                root = root.left;
            }
        }

        return floor;
    }
}
