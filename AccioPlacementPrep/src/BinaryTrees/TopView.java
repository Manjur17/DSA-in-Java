package BinaryTrees;

import java.util.*;


public class TopView {
    static ArrayList<Integer> topView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeMap<Integer, Integer> map = new TreeMap<>(); //<Position , root.val>
        Queue<Pair> q = new LinkedList<>(); // pair < root/node, position>
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int line = pair.position;

            if (!map.containsKey(line))
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

    static ArrayList<Integer> topViewI(TreeNode root) {
        int left = 0, right = -1;
        Queue<Pair> queue = new LinkedList<>();
        Deque<Integer> list = new ArrayDeque<>();
        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair pair = queue.poll();

            if (pair.position < left) {
                list.addFirst(pair.node.val);
                left--;
            } else if (pair.position > right) {
                list.addLast(pair.node.val);
                right++;
            }

            if (pair.node.left != null)
                queue.add(new Pair(pair.node.left, pair.position - 1));
            if (pair.node.right != null)
                queue.add(new Pair(pair.node.right, pair.position + 1));
        }

        return new ArrayList<>(list);
    }


}
