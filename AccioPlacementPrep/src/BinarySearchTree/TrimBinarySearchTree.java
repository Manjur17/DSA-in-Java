package BinarySearchTree;

import java.util.*;

public class TrimBinarySearchTree {
    public TreeNode trimBSTPost(TreeNode root, int minValue, int maxValue) {
        if (root == null)
            return null;

        root.left = trimBSTPost(root.left, minValue, maxValue);
        root.right = trimBSTPost(root.right, minValue, maxValue);

        if (root.val < minValue) return root.right;
        if (root.val > maxValue) return root.left;

        return root;
    }

    public TreeNode trimBSTPre(TreeNode root, int low, int high) {
        if (root == null)
            return null;

        if (root.val < low)
            return trimBSTPre(root.right, low, high); // recurse on the right node since the current node is lesser
        if (root.val > high)
            return trimBSTPre(root.left, low, high); // recurse on the left node since the current node is greater

        root.left = trimBSTPre(root.left, low, high); // left node is passed to the next level
        root.right = trimBSTPre(root.right, low, high); // right node is passed to the next level

        return root;
    }

    public TreeNode trimBSTDFS(TreeNode root, int low, int high) {
        if (root == null) return null;

        //remove all the non range nodes
        while (root.val < low || root.val > high) {
            if (root.val < low) root = root.right;
            if (root.val > high) root = root.left;
        }

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        boolean flag = false;

        while (!st.isEmpty()) {
            TreeNode node = st.pop();

            //fix the nodes to point to correct child
            if (node.left != null && node.left.val < low) {
                node.left = node.left.right;
                flag = true;
            }
            if (node.right != null && node.right.val > high) {
                node.right = node.right.left;
                flag = true;
            }

            if (flag) st.push(node);
            else {
                if (node.left != null) st.push(node.left);
                if (node.right != null) st.push(node.right);
            }

            flag = false;
        }

        return root;
    }

    public TreeNode trimBSTBFS(TreeNode root, int low, int high) {
        if (root == null) return null;

        // Add the valid node's to the list in BFS
        List<TreeNode> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (node.val >= low && node.val <= high) list.add(node);
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }
        }

        //Start from the list index 0, set the left and right as null
        TreeNode parent = list.get(0);
        parent.left = null;
        parent.right = null;

        // iterate for each valid nodes and insert it back in valid BST fashion
        for (int i = 1; i < list.size(); i++) {
            TreeNode node = list.get(i);
            node.left = null;
            node.right = null;
            insertChild(parent, node);
        }
        return parent;
    }

    private void insertChild(TreeNode parent, TreeNode node) {
        while (parent != null) {
            if (parent.val > node.val) { // BST Parent should be greater than left node
                if (parent.left == null) {
                    parent.left = node;
                    return;
                }
                parent = parent.left;
            } else if (parent.val < node.val) {  // BST Parent should be smaller than right node
                if (parent.right == null) {
                    parent.right = node;
                    return;
                }
                parent = parent.right;
            }
        }
    }

}
