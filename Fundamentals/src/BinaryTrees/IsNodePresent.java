package BinaryTrees;

public class IsNodePresent {
    public boolean isNodePresent(TreeNode node,int x){
        if (node == null){
            return false;
        }
        if (node.val == x){
            return true;
        }
        return isNodePresent(node.left, x) || isNodePresent(node.right, x);
    }
}
