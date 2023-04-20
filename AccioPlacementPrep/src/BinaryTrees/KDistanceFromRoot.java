package BinaryTrees;

import java.util.ArrayList;

public class KDistanceFromRoot {
    ArrayList<Integer> Kdistance(TreeNode root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root, k, list);
        return list;
    }

    private void helper(TreeNode root, int k, ArrayList<Integer> list) {
        if (root == null)
            return;

        if (k == 0) {
            list.add(root.val);
            return;
        }

        helper(root.left, k - 1, list);
        helper(root.right, k - 1, list);
    }
}
