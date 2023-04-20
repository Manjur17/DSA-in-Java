package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class PathToGivenNode {
    public int[] solve(TreeNode root, int B) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return new int[]{};

        helper(root, B, list);
        int[] ans = new int[list.size()];
        int j = 0;
        for (int x : list) {
            ans[j++] = x;
        }
        return ans;
    }

    private boolean helper(TreeNode root, int target, List<Integer> list) {
        if (root == null) {
            return false;
        }

        list.add(root.val);
        if (root.val == target) {
            return true;
        }

        if (helper(root.left, target, list) || helper(root.right, target, list))
            return true;

        list.remove(list.size() - 1);
        return false;
    }
}
