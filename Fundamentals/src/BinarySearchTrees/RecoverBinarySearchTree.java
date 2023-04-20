package BinarySearchTrees;

public class RecoverBinarySearchTree {
    private TreeNode first;
    private TreeNode prev;
    private TreeNode middle;
    private TreeNode last;
    private void inorderTraversal(TreeNode root){
        if (root == null){
            return;
        }
        inorderTraversal(root.left);
        //root part
        if (prev != null && prev.val > root.val){
            if (first == null){
                //First Violation
                first = prev;
                middle = root;
            }else{
                //Second Violation
                last = root;
            }
        }
        prev = root;
        inorderTraversal(root.right);
    }
    public void recoverTree(TreeNode root) {
        prev = new TreeNode(Integer.MIN_VALUE);
        inorderTraversal(root);
        if(first!=null && last!=null) {
            //Case 1 violation so swap last and first
            int t = first.val;
            first.val = last.val;
            last.val = t;
        }
        else if(first!=null && middle!=null)  {
            //Case 2 violation so swap last and middle
            int t = first.val;
            first.val = middle.val;
            middle.val = t;
        }
    }
}
