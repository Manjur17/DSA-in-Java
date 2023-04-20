package BinaryTrees;

public class SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }

    private int helper(TreeNode root, int num) {
        if (root == null) return 0;

        num = num * 10 + root.val;

        int sum = 0;

        if (root.left == null && root.right == null) {
            sum += num;
            return sum;
        }

        sum += helper(root.left, num);
        sum += helper(root.right, num);

        return sum;
    }
}
