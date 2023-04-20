package BinaryTrees;

import java.util.ArrayList;
import java.util.Collections;

public class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        rootHelper(root1, list1);
        rootHelper(root2, list2);
        return list1.equals(list2);
    }

    private void rootHelper(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        if (root.left == null && root.right == null) {
            list.add(root.val);
            return;
        }

        rootHelper(root.left, list);
        rootHelper(root.right, list);
    }
}
