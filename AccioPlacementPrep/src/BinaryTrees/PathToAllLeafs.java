package BinaryTrees;

import java.util.*;

public class PathToAllLeafs {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(root, ans, list);
        return ans;
    }

    private void helper(TreeNode root, List<String> ans, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);
        //check for leaf node
        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            int i;
            for (i = 0; i < list.size() - 1; i++) {
                sb.append(list.get(i)).append("->");
            }
            sb.append(list.get(i));
            ans.add(sb.toString());
        }

        helper(root.left, ans, list);
        helper(root.right, ans, list);

        list.remove(list.size() - 1);
    }
}
