package BinarySearchTrees;

public class ConstructBSTFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder,Integer.MAX_VALUE,new int[]{0});
    }

    private TreeNode helper(int[] preorder, int bound, int[] ints) {
        if (ints[0] == preorder.length || preorder[ints[0]] > bound){
            return null;
        }
        TreeNode node = new TreeNode(preorder[ints[0]++]);
        node.left = helper(preorder,node.val,ints);
        node.right = helper(preorder,bound,ints);
        return node;
    }
}
