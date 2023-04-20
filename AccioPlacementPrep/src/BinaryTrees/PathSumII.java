package BinaryTrees;

import java.util.*;

public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, targetSum, 0, ans, list);
        return ans;
    }

    private void helper(TreeNode root, int targetSum, int sum, List<List<Integer>> ans, List<Integer> list) {
        if (root == null) {
            return;
        }

        list.add(root.val);
        //check for leaf node
        if (root.left == null && root.right == null) {
            if (root.val + sum == targetSum) {
                ans.add(new ArrayList<>(list));
            }
        }

        helper(root.left, targetSum, sum + root.val, ans, list);
        helper(root.right, targetSum, sum + root.val, ans, list);
        list.remove(list.size() - 1);
    }
}
