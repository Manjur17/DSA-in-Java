package BinaryTrees;

import java.util.ArrayList;

public class BoundaryTraversalBinaryTree {
    static boolean isLeaf(TreeNode root) {
        return (root.left == null) && (root.right == null);
    }

    static void addLeftBoundary(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        while (root != null) {
            if (isLeaf(root)) break;

            list.add(root.val);
            if (root.left != null) root = root.left;
            else root = root.right;
        }
    }

    static void addRightBoundary(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        ArrayList<Integer> tempList = new ArrayList<>();

        while (root != null) {
            if (isLeaf(root)) break;

            tempList.add(0, root.val);
            if (root.right != null) root = root.right;
            else root = root.left;
        }

        list.addAll(tempList);
    }

    static void addLeaves(TreeNode root, ArrayList<Integer> list) {
        if (root == null) return;

        if (isLeaf(root)) {
            list.add(root.val);
            return;
        }
        addLeaves(root.left, list);
        addLeaves(root.right, list);
    }

    static ArrayList<Integer> printBoundary(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(root.val);
        if (isLeaf(root))
            return list;

        addLeftBoundary(root.left, list);
        addLeaves(root, list);
        addRightBoundary(root.right, list);
        return list;
    }
}
