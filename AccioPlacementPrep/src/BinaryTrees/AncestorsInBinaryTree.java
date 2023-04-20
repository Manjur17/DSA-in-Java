package BinaryTrees;

import java.util.ArrayList;
//https://practice.geeksforgeeks.org/problems/ancestors-in-binary-tree/1
public class AncestorsInBinaryTree {
    //Similar to Path To Given Node
    public static ArrayList<Integer> Ancestors(TreeNode root, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        nodeToRootPath(root, target, list);
        list.remove(0); //if given in question then only
        return list;
    }

    static boolean nodeToRootPath(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null) {
            return false;
        }

        list.add(0, root.val);

        if (root.val == target) {
            return true;
        }

        if (nodeToRootPath(root.left, target, list) || nodeToRootPath(root.right, target, list))
            return true;

        list.remove(0);
        return false;
    }
}
