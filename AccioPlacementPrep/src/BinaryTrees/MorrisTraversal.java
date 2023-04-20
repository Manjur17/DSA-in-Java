package BinaryTrees;

import java.util.*;

public class MorrisTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) { //case 1
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr;
                    curr = curr.left; //left
                } else {
                    prev.right = null;
                    list.add(curr.val); //root
                    curr = curr.right; //right
                }
            }
        }
        return list;
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null)
            return list;

        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) { //case 1
                list.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {
                    prev = prev.right;
                }

                if (prev.right == null) {
                    prev.right = curr;
                    list.add(curr.val); //root
                    curr = curr.left; //left
                } else {
                    prev.right = null;
                    curr = curr.right; //right
                }
            }
        }
        return list;
    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null) {
            return list;
        }
        //Use the idea of Morris Traversal, but we change the order between right and left
        TreeNode curr = root;
        while (curr != null) {
            if (curr.right == null) {
                list.add(0, curr.val);
                curr = curr.left;
            } else {
                TreeNode prev = curr.right;
                while (prev.left != null && prev.left != curr) {
                    prev = prev.left;
                }
                if (prev.left == curr) { //second time visit, we break the link, and go to the left branch
                    prev.left = null;
                    curr = curr.left;
                } else { //first time visit, we connect two nodes here, and go to the right branch
                    prev.left = curr;
                    list.add(0, curr.val);
                    curr = curr.right;
                }
            }
        }
        return list;
    }
}
