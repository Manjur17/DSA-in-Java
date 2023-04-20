package BinaryTrees;

public class FlattenBinaryTreToDLL {
    TreeNode buildDLL(TreeNode root) {
        TreeNode[] prev = {null};
        return buildList(root, prev);
    }

    private TreeNode buildList(TreeNode root, TreeNode[] prev) {
        if (root == null)
            return null;

        //Inorder Traversal
        TreeNode head = buildList(root.left, prev);

        if (prev[0] == null) {
            head = root;
        } else {
            root.left = prev[0];
            prev[0].right = root;
        }
        prev[0] = root;

        buildList(root.right, prev);
        return head;
    }
}
