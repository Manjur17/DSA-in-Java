package BinarySearchTree;

import java.util.HashSet;

public class TwoSumBST {
    public boolean findTarget(TreeNode root, int k) {
        return isPairSum(root, k, new HashSet<>());
    }

    private boolean isPairSum(TreeNode root, int target, HashSet<Integer> set) {
        if (root == null) return false;

        if (set.contains(target - root.val))
            return true;

        set.add(root.val);

        return isPairSum(root.left, target, set) || isPairSum(root.right, target, set);
    }
}
