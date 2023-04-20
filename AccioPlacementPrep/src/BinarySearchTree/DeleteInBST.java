package BinarySearchTree;

public class DeleteInBST {
    TreeNode deleteNodeI(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key)
            root.left = deleteNodeI(root.left, key);
        else if (root.val < key)
            root.right = deleteNodeI(root.right, key);
        else {//root.val == key -> we have to delete this node

            //Case 1 -> Delete a leaf node
            if (root.right == null && root.left == null)
                return null;

            //Case 2 -> Delete a node with single child
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;

            //Case 3 -> Delete a node with both child
            TreeNode temp = root.right;
            while (temp.left != null) {
                temp = temp.left;
            }
            temp.left = root.left;
            return root.right;
        }

        return root;
    }

    public TreeNode delete(TreeNode root, int key) {
        if (root == null) return null;

        if (root.val > key)
            root.left = delete(root.left, key);
        else if (root.val < key)
            root.right = delete(root.right, key);
        else {//root.val == key -> we have to delete this node

            //Case 1 -> Delete a leaf node
            if (root.right == null && root.left == null)
                return null;

            //Case 2 -> Delete a node with single child
            if (root.right == null) return root.left;
            if (root.left == null) return root.right;

            //Case 3 -> Delete a node with both child
            TreeNode temp = findSuccessor(root.right);
            root.val = temp.val;
            root.right = delete(root.right, temp.val);

        }
        // root represents the updated BST
        return root;
    }

    TreeNode findSuccessor(TreeNode root) {
        if (root == null || root.left == null)
            return root;

        return findSuccessor(root.left);
    }

}
