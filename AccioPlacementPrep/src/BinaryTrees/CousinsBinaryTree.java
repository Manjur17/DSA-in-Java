package BinaryTrees;

import java.util.*;
import java.util.Queue;

public class CousinsBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            boolean isXExist = false;
            boolean isYExist = false;

            //Level starts
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                //check for siblings -> EDGE CASE
                if (curr.left != null && curr.right != null) {
                    if (curr.left.val == x && curr.right.val == y) {
                        return false;
                    }
                    if (curr.left.val == y && curr.right.val == x) {
                        return false;
                    }
                }

                if (curr.val == x) isXExist = true;
                if (curr.val == y) isYExist = true;

                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            //Level ends
            if (isXExist && isYExist) return true;
        }


        return false;
    }

    //print all cousins
    public static ArrayList<Integer> printCousins(TreeNode root, TreeNode node_to_find) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean isFound = false;
        while (!q.isEmpty() && !isFound) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left == node_to_find || curr.right == node_to_find) {
                    //don't push siblings inside queue
                    isFound = true;
                } else {
                    if (curr.left != null) q.add(curr.left);
                    if (curr.right != null) q.add(curr.right);
                }
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        if (q.isEmpty()) {
            list.add(-1);
            return list;
        }

        while (!q.isEmpty()) {
            list.add(q.poll().val);
        }
        return list;
    }
}
