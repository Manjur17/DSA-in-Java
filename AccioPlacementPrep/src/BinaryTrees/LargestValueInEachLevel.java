package BinaryTrees;

import java.util.*;

public class LargestValueInEachLevel {
    public ArrayList<Integer> largestValues(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                max = Math.max(max, curr.val);

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            list.add(max);
        }

        return list;
    }
}
