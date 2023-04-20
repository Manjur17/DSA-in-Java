package BinarySearchTrees;

public class SuccessorAndPredecessor {
    public TreeNode inorderBSTSuccessor(TreeNode root,TreeNode p){
        TreeNode successor = null;
        while (root != null){
            if (p.val >= root.val){
                root = root.right;
            }else {
                successor = root;
                root = root.left;
            }
        }
        return successor;
    }
    public TreeNode inorderBSTPredecessor(TreeNode root,TreeNode p){
        TreeNode predecessor = null;
        while (root != null){
            if (root.val >= p.val){
                root = root.left;
            }else {
                predecessor = root;
                root = root.right;
            }
        }
        return predecessor;
    }
}
