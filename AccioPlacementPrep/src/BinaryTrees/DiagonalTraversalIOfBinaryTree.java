package BinaryTrees;

import java.util.*;

public class DiagonalTraversalIOfBinaryTree {
    public ArrayList<Integer> diagonal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            root = q.poll();

            while (root != null) {
                list.add(root.val);

                if (root.left != null) {
                    q.add(root.left);
                }

                root = root.right;
            }
        }

        return list;
    }
}
