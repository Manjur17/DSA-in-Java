package BinarySearchTree;

public class RecoverBinarySearchTree {
    private TreeNode prev = null, first = null, second = null;

    public void recoverTree(TreeNode root) {
        fixBST(root);
        //swap first and second to make the BST Valid
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
    }

    public void fixBST(TreeNode root) {
        if (root == null)
            return;

        fixBST(root.left);

        if (prev != null && root.val < prev.val) {
            //1st violation
            if (first == null)
                first = prev;
            //if there is 2nd violation it will be updated
            second = root;
        }

        prev = root;
        fixBST(root.right);
    }
}
