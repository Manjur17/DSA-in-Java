package BinaryTrees;

import java.util.*;

public class OddEvenLevelDifference {
    public int getLevelDiff(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        int oddSum = 0, evenSum = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (flag)
                    oddSum += curr.val;
                else
                    evenSum += curr.val;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }

            flag = !flag;
        }

        return oddSum - evenSum;
    }
}
