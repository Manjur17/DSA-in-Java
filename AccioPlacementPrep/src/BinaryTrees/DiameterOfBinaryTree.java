package BinaryTrees;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = {0};
        height(root, diameter);
        return diameter[0];
    }

    private int height(TreeNode root, int[] diameter) {
        if (root == null) return 0;

        int lh = height(root.left, diameter);
        int rh = height(root.right, diameter);
        diameter[0] = Math.max(diameter[0], lh + rh); //in gfg diameter is 1 + lh + rh
        return 1 + Math.max(lh, rh);
    }

    static int diameterBrute(TreeNode root) {
        if (root == null)
            return 0;

        // get the height of left and right root
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        // Now go to left and right of root and do the same stuff for each node
        int leftDiameter = diameterBrute(root.left);
        int rightDiameter = diameterBrute(root.right);

        /* Return max of following three
          1) Diameter of left subtree
          2) Diameter of right subtree
          3) Height of left subtree + height of right subtree + 1
         */
        return Math.max(leftHeight + rightHeight + 1, Math.max(leftDiameter, rightDiameter));
    }

    public static int height(TreeNode root) {
        if (root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        return 1 + Math.max(lh, rh);
    }
}
