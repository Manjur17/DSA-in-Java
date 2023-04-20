package BinaryTrees;

public class ChildrenSumProperty {
    private static boolean isSumProperty(TreeNode root) {
        if (root == null) return true;

        //check for leaf node -> VVVIMP
        //leaf node always follow children sum property
        if (root.left == null && root.right == null) {
            return true;
        }

        int childSum = 0;
        if (root.left != null) {
            childSum += root.left.val;
        }
        if (root.right != null) {
            childSum += root.right.val;
        }

        boolean isSame = childSum == root.val;
        boolean left = isSumProperty(root.left);
        boolean right = isSumProperty(root.right);

        return isSame && left && right;
    }

    static void reorder(TreeNode root) {
        if (root == null) return;

        int childSum = 0;
        if (root.left != null) {
            childSum += root.left.val;
        }
        if (root.right != null) {
            childSum += root.right.val;
        }

        //check -1
        if (childSum < root.val) {
            //update the children val
            if (root.left != null)
                root.left.val = root.val;

            if (root.right != null)
                root.right.val = root.val;
        } else {
            root.val = childSum;
        }

        reorder(root.left);
        reorder(root.right);

        int sum = 0;
        if (root.left != null)
            sum += root.left.val;
        if (root.right != null)
            sum += root.right.val;

        //check for leaf node -> VVVIMP if not then only update
        if (root.left != null || root.right != null)
            root.val = sum;
    }
}
