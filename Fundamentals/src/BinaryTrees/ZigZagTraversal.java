package BinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ZigZagTraversal {
    public static TreeNode takeInput(boolean isRoot, int parentData, boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter the root element");
        } else {
            if (isLeft) {
                System.out.println("Enter the left child of " + parentData);
            } else {
                System.out.println("Enter the right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1) {
            return null;
        }
        TreeNode root = new TreeNode(rootData);
        TreeNode leftChild = takeInput(false, rootData, true);
        TreeNode rightChild = takeInput(false, rootData, false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if (root == null) {
            return list;
        }
        queue.add(root);
        boolean flag = true;
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
                if (flag) {
                    subList.add(queue.poll().val);
                } else {
                    subList.add(0, queue.poll().val);
                }
            }
            flag = !flag;
            list.add(subList);
        }
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = takeInput(true,0,false);
        System.out.println(zigzagLevelOrder(root));
    }
}
