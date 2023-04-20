package BinarySearchTree;

import java.util.*;

//https://leetcode.com/problems/kth-smallest-element-in-a-bst/
public class KthSmallestElementInBST {
    public int KthSmallest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();
        while (!st.isEmpty() || root != null) {
            while (root != null) {
                st.push(root);
                root = root.left;
            }

            root = st.pop();
            if (--k == 0) return root.val;
            root = root.right;

        }

        return -1;
    }

    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        helperInorder(root, list);
        if (k > list.size()) return -1;
        return list.get(k - 1);
    }

    private void helperInorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        helperInorder(root.left, list);
        list.add(root.val);
        helperInorder(root.right, list);
    }
}
