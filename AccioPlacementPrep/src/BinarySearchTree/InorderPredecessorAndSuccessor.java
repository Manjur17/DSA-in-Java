package BinarySearchTree;

public class InorderPredecessorAndSuccessor {
    public static void findPreSuc(TreeNode root, TreeNode node) {
        TreeNode curr = root;
        TreeNode successor = null, predecessor = null;

        while (curr != null) {
            if (node.val >= curr.val)
                curr = curr.right;
            else {
                successor = curr;
                curr = curr.left;
            }
        }
        curr = root;
        while (curr != null) {
            if (node.val <= curr.val)
                curr = curr.left;
            else {
                predecessor = curr;
                curr = curr.right;
            }
        }
    }
}
