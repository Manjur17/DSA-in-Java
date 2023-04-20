package BinaryTrees;

import java.util.*;

public class BottomView {
    static ArrayList<Integer> bottomView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeMap<Integer, Integer> map = new TreeMap<>(); //<Position , root.val>
        Queue<Pair> q = new LinkedList<>(); // pair < root, position>
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int line = pair.position;

            map.put(line, node.val);

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
