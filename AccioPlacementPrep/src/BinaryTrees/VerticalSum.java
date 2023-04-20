package BinaryTrees;

import java.util.*;

public class VerticalSum {
    public ArrayList <Integer> verticalSum(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeMap<Integer, Integer> map = new TreeMap<>(); // <position, sum>
        Queue<Pair> q = new LinkedList<>(); // pair < root, position>
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int line = pair.position;

            int currSum = map.getOrDefault(line, 0);
            map.put(line, currSum + node.val);

            if (node.left != null) {
                q.add(new Pair(node.left, line - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, line + 1));
            }
        }

        list.addAll(map.values());
        return list;
    }
}
