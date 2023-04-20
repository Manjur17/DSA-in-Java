package BinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int level = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i < level; i++) {
                if (queue.peek() != null && queue.peek().left != null) {
                    queue.add(queue.peek().left);
                }
                if (queue.peek() != null && queue.peek().right != null) {
                    queue.add(queue.peek().right);
                }
                if (!queue.isEmpty()) {
                    subList.add(queue.poll().val);
                }
            }
            list.add(subList);
        }
        return list;
    }

    static void printLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            System.out.print(tempNode.val + " ");

            /* Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /* Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(levelOrder(root));
        printLevelOrder(root);
    }
}
