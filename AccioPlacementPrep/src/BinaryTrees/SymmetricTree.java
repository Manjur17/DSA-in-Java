package BinaryTrees;

class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return symmetricHelper(root.left, root.right);
    }

    public boolean symmetricHelper(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == null && q == null;
        }

        if (p.val != q.val) return false;

        return symmetricHelper(p.left, q.right) && symmetricHelper(p.right, q.left);
    }
}