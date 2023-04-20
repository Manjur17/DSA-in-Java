package BinaryTrees;

import java.util.*;

class PrintBinaryTree {
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }

    public void helper(TreeNode root, List<List<String>> res, int start, int end, int rows, int level) {
        if (root == null || rows == level) return;

        int index = (start + end) / 2;

        res.get(level).set(index, Integer.toString(root.val));

        helper(root.left, res, start, index - 1, rows, level + 1);
        helper(root.right, res, index + 1, end, rows, level + 1);
    }

    public List<List<String>> printTree(TreeNode root) {
        List<List<String>> res = new ArrayList<>();
        int depth = depth(root);
        int row = depth;
        int col = (int) (Math.pow(2, depth) - 1);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < col; i++) list.add("");
        for (int i = 0; i < row; i++) res.add(new ArrayList<>(list));

        helper(root, res, 0, col - 1, row, 0);

        return res;
    }

}