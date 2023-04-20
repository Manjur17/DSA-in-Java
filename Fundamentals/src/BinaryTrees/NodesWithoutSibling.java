package BinaryTrees;

public class NodesWithoutSibling {
    public void nodesWithoutSiblings(TreeNode root){
        if (root == null){
            return;
        }
        if (root.right!= null && root.left == null){
            System.out.println( root.right.val);
        }else if (root.left!= null && root.right == null){
            System.out.println( root.left.val);
        }
        nodesWithoutSiblings(root.left);
        nodesWithoutSiblings(root.right);
    }
}
