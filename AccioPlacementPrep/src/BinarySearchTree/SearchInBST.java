package BinarySearchTree;

public class SearchInBST {
    public TreeNode searchBST(TreeNode root, int key) {
        if (root == null) return null;

        while (root != null && root.val != key) {
            if (root.val > key) root = root.left;
            else root = root.right;
        }

        return root;
    }

    static boolean search(TreeNode root, int x) {
        if (root == null) return false;

        if (root.val == x) return true;
        if (root.val < x) return search(root.right, x);
        return search(root.left, x);
    }
}
