package BinarySearchTrees;

public class DeleteNodeInBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            return helper(root);
        }
        TreeNode dummyRoot = root;
        while (root != null) {
            if (root.val > key) {
                if (root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                }else {
                    root = root.left;
                }
            } else {
                if (root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                }else {
                    root = root.right;
                }
            }
        }
        return dummyRoot;
    }

    private TreeNode helper(TreeNode root) {
        //edge cases
        if (root.left == null) {
            return root.right;
        }
        if (root.right == null) {
            return root.left;
        }
        TreeNode rightChild = root.right;
        TreeNode lastRightChild = findRightFind(root.left);
        lastRightChild.right = rightChild;
        return root.left;
    }

    private TreeNode findRightFind(TreeNode root) {
        if (root.right == null) {
            return root;
        }
        return findRightFind(root.right);
    }
}
