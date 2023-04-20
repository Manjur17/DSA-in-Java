package BinaryTrees;

import java.util.*;

public class PathSumIII {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> map = new HashMap<>();
        return pathSumHelper(root, targetSum, map, 0);
    }

    private int pathSumHelper(TreeNode root, int targetSum, HashMap<Long, Integer> map, long currSum) {
        if (root == null) return 0;

        int count = 0;
        currSum += root.val; // get the prefix sum till this node
        if (currSum == targetSum)
            count++;

        // if currSum exists in the map then we found have found a path( similar to "Subarray sum equals K" problem)

        if (map.containsKey(currSum - targetSum)) {
            count += map.get(currSum - targetSum);
        }

        // add the newly calculated prefix sum to the map
        map.put(currSum, map.getOrDefault(currSum, 0) + 1);


        // get the paths from its left and the right children
        count += pathSumHelper(root.left, targetSum, map, currSum);
        count += pathSumHelper(root.right, targetSum, map, currSum);
        //after calculating, we now remove the currSum from the map
        //as we are done for that path
        map.put(currSum, map.get(currSum) - 1);

        return count;
    }


    public int pathSumI(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int countPaths = pathSumHelper(root, targetSum, 0);
        int leftPaths = pathSumI(root.left, targetSum);
        int rightPaths = pathSumI(root.right, targetSum);
        return countPaths + leftPaths + rightPaths;
    }

    private int pathSumHelper(TreeNode root, int targetSum, long currSum) {
        if (root == null) return 0;

        int count = 0;
        if (targetSum == currSum + root.val) {
            count++;
        }

        count += pathSumHelper(root.left, targetSum, currSum + root.val);
        count += pathSumHelper(root.right, targetSum, currSum + root.val);

        return count;
    }

    public int pathSumBrute(TreeNode root, int targetSum) {
        if (root == null) return 0;

        int[] count = {0};
        pathSumHelper(root, targetSum, 0, count);
        int leftPaths = pathSumBrute(root.left, targetSum);
        int rightPaths = pathSumBrute(root.right, targetSum);
        return count[0] + leftPaths + rightPaths;
    }

    private void pathSumHelper(TreeNode root, int targetSum, long currSum, int[] count) {
        if (root == null) return;

        if (targetSum == currSum + root.val) {
            count[0]++;
        }

        pathSumHelper(root.left, targetSum, currSum + root.val, count);
        pathSumHelper(root.right, targetSum, currSum + root.val, count);
    }
}
