package BinaryTrees;

public class SumOfNodesWithEvenValuedGrandparent {
    public int helper(TreeNode root, TreeNode parent, TreeNode grandParent) {
        if (root == null) return 0;

        int sum = 0;

        if (grandParent != null && (grandParent.val % 2) == 0)
            sum += root.val;

        sum += helper(root.left, root, parent);
        sum += helper(root.right, root, parent);

        return sum;
    }

    public int sumEvenGrandparent(TreeNode root) {
        return helper(root, null, null);
    }

}
