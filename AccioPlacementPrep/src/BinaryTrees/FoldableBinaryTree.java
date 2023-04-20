package BinaryTrees;

public class FoldableBinaryTree {
    boolean isFoldable(TreeNode root) {
        if (root == null) return true;

        return foldTree(root.left, root.right);
    }

    public boolean foldTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }

        return foldTree(p.left, q.right) && foldTree(p.right, q.left);
    }
}
