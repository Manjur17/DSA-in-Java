package BinaryTrees;
//https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/
public class BurningTree {
    public static void burningTreeNode(TreeNode root, int time, TreeNode blockNode, int[] totalTime) {
        if (root == null || root == blockNode)
            return;
        totalTime[0] = Math.max(totalTime[0], time);
        burningTreeNode(root.left, time + 1, blockNode, totalTime);
        burningTreeNode(root.right, time + 1, blockNode, totalTime);
    }

    public static int burnTree(TreeNode root, int target, int[] totalTime) {
        if (root == null)
            return -1;

        if (root.val == target) {
            burningTreeNode(root, 0, null, totalTime);
            return 1;
        }

        int lt = burnTree(root.left, target, totalTime);
        if (lt != -1) {
            burningTreeNode(root, lt, root.left, totalTime);
            return lt + 1;
        }

        int rt = burnTree(root.right, target, totalTime);
        if (rt != -1) {
            burningTreeNode(root, rt, root.right, totalTime);
            return rt + 1;
        }

        return -1;
    }

    public static int burningTree(TreeNode root, int fireNode) {
        int[] totalTime = {0};
        burnTree(root, fireNode, totalTime);
        return totalTime[0];
    }
}
