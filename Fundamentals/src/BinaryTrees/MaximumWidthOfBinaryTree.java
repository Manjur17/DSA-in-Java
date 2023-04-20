package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        while (!q.isEmpty()) {
            int size = q.size();
            int min = q.peek().num;
            int first = 0, last = 0;
            for (int i = 0; i < size; i++) {
                int currID = q.peek().num - min;
                TreeNode node = q.poll().node;
                if (i == 0) {
                    first = currID;
                }
                if (i == size - 1) {
                    last = currID;
                }
                if (node.left != null) {
                    q.add(new Pair(node.left, currID * 2 + 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, currID * 2 + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
        }
        return ans;
    }

    static class Pair {
        int num;
        TreeNode node;

        Pair(TreeNode node, int num) {
            this.node = node;
            this.num = num;
        }
    }
}
