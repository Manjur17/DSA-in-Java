package BinaryTrees;

import java.util.*;

public class PreorderTraversal {
    public static void main(String[] args) throws java.lang.Exception {
        TreeNode root = new TreeNode();
        root = root.add();
        List<Integer> list = preorderTraversal(root);
        for (int x : list) {
            System.out.print(x + " ");
        }
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root == null)
            return;
        list.add(root.val);
        helper(root.left, list);
        helper(root.right, list);
    }
}
