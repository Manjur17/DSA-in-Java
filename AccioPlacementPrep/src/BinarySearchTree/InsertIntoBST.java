package BinarySearchTree;

public class InsertIntoBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode node = root;
        while (true) {
            if(node.val == val) break;

            if (node.val < val) {
                //go to right
                if (node.right != null) {
                    node = node.right;
                } else {
                    node.right = new TreeNode(val);
                    break;
                }
            } else {
                //go to left
                if (node.left != null) {
                    node = node.left;
                } else {
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
