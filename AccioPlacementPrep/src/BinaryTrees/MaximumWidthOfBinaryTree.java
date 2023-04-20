package BinaryTrees;

import java.util.*;

public class MaximumWidthOfBinaryTree {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int ans = 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            int minIndex = q.peek().index; // get the min index for that level
            int left = 0, right = 0;

            for (int i = 0; i < size; i++) {
                Pair pair = q.poll();
                TreeNode node = pair.node;
                int currIndex = pair.index; //get the curr index of the node in that level
                int newIndex = currIndex - minIndex; // make new Index for that node in the level

                if (i == 0) {
                    left = newIndex;
                }
                if (i == size - 1) {
                    right = newIndex;
                }

                if (node.left != null) {
                    q.add(new Pair(node.left, newIndex * 2 + 1)); //can subtract min here also
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, newIndex * 2 + 2)); //can subtract min here also
                }
            }

            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }

    static class Pair {
        int index;
        TreeNode node;

        Pair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }
    }
}
