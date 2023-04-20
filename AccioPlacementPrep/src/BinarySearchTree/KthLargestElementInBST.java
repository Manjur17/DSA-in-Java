package BinarySearchTree;

import java.util.*;

public class KthLargestElementInBST {
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> st = new Stack<>();

        while (!st.isEmpty() || root != null) {
            while (root != null) {
                st.push(root);
                root = root.right;
            }
            root = st.pop();
            if (--k == 0) return root.val;
            root = root.left;
        }

        return -1;
    }

    public int kthLargestRecursive(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        helperInorder(root, list);
        if (k > list.size()) return -1;
        return list.get(list.size() - k);
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
