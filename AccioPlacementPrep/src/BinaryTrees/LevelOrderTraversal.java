package BinaryTrees;

import java.util.*;

public class LevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int n = q.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
                list.add(curr.val);
            }
            ans.add(list);
        }

        return ans;
    }

    static ArrayList<Integer> levelOrderII(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();
            if (curr.left != null) q.add(curr.left);
            if (curr.right != null) q.add(curr.right);
            list.add(curr.val);
        }

        return list;
    }
}
