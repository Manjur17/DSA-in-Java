package BinarySearchTree;

public class LCAInBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;

        int curr = root.val;

        if (curr == p.val || curr == q.val)
            return root;

        if (curr > p.val && curr > q.val) //go to left
            return lowestCommonAncestor(root.left, p, q);
        if (curr < p.val && curr < q.val) //go to left
            return lowestCommonAncestor(root.right, p, q);

        //they split at this point as we cannot say which node will lie on which side
        return root;
    }
}
