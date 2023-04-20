package BinaryTrees;


import java.util.*;

public class MirrorTree {
    public TreeNode invertTree(TreeNode root) {
        //if it leaf node or root is null
        if (root == null || (root.left == null && root.right == null)) {
            return root;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            TreeNode temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;

            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
        }

        return root;
    }

    void mirrorTree(TreeNode root) {
        buildMirrorTree(root);
    }

    TreeNode buildMirrorTree(TreeNode root) {
        if (root == null || (root.left == null && root.right == null))
            return root;

        TreeNode left = buildMirrorTree(root.left);
        TreeNode right = buildMirrorTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
