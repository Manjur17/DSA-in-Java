package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class LeftSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        leftViewHelper(root, list, 0);
        return list;
    }

    private void leftViewHelper(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root.val);
        }
        leftViewHelper(root.left, list, level + 1);
        leftViewHelper(root.right, list, level + 1);
    }
}
