package BinaryTrees;

import java.util.Scanner;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public TreeNode add() {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();

        if (val == -1) return null;

        TreeNode root = new TreeNode(val);
        TreeNode leftChild = add();
        TreeNode rightChild = add();
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }
}
