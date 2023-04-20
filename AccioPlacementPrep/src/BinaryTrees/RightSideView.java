package BinaryTrees;

import java.util.*;

public class RightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightViewHelper(root, list, 0);
        return list;
    }

    private void rightViewHelper(TreeNode root, List<Integer> list, int level) {
        if (root == null) {
            return;
        }
        if (level == list.size()) {
            list.add(root.val);
        }
        rightViewHelper(root.right, list, level + 1);
        rightViewHelper(root.left, list, level + 1);
    }
}
