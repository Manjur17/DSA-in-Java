package BinaryTrees;

import java.util.*;

public class KDistanceFromAnyNode {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<TreeNode> list = new ArrayList<>();
        nodeToRootPath(root, target, list);

        List<Integer> ans = new ArrayList<>();

        TreeNode blockNode = null;
        for (int i = 0; i < list.size(); i++) {
            KDistance(list.get(i), k - i, blockNode, ans);
            blockNode = list.get(i);
        }

        return ans;
    }

    //     Finding node(target) to root path but in reverse
    public boolean nodeToRootPath(TreeNode root, TreeNode target, List<TreeNode> list) {
        if (root == null) {
            return false;
        }

        list.add(0, root);

        if (root == target) {
            return true;
        }

        if (nodeToRootPath(root.left, target, list) || nodeToRootPath(root.right, target, list))
            return true;

        list.remove(0);
        return false;
    }

    // Going k-level down for a given node and print (K-i)th distance nodes.
    public void KDistance(TreeNode root, int k, TreeNode block, List<Integer> ans) {
        if (root == null || k < 0 || root == block)
            return;

        if (k == 0) {
            ans.add(root.val);
            return;
        }

        KDistance(root.left, k - 1, block, ans);
        KDistance(root.right, k - 1, block, ans);
    }
}
