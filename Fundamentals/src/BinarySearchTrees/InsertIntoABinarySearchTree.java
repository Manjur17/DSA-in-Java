package BinarySearchTrees;

public class InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null){
            return new TreeNode(val);
        }
        TreeNode node = root;
        while (true){
            if (val >= node.val){
                if (node.right != null){
                    node = node.right;
                }else {
                    node.right = new TreeNode(val);
                    break;
                }
            }else{
                if (node.left != null){
                    node = node.left;
                }else {
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
