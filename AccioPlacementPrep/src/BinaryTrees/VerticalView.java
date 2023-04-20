package BinaryTrees;

import java.util.*;

public class VerticalView {
    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        TreeMap<Integer, List<Integer>> map = new TreeMap<>(); //<Position , root.val>
        Queue<Pair> q = new LinkedList<>(); // pair < root, position>
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            int size = q.size();
            HashMap<Integer, List<Integer>> levelMap = new HashMap<>();
            for (int i = 0; i < size; i++) {
                Pair pair = q.poll();
                int line = pair.position;
                TreeNode node = pair.node;

                List<Integer> mapList = levelMap.getOrDefault(line, new ArrayList<>());
                mapList.add(node.val);
                Collections.sort(mapList);
                levelMap.put(line, mapList);


                if (node.left != null) {
                    q.add(new Pair(node.left, line - 1));
                }
                if (node.right != null) {
                    q.add(new Pair(node.right, line + 1));
                }
            }

            for (Integer key : levelMap.keySet()) {
                List<Integer> mapList = map.getOrDefault(key, new ArrayList<>());
                mapList.addAll(levelMap.get(key));
                map.put(key, mapList);
            }
        }

        list.addAll(map.values());
        return list;
    }

    static ArrayList<Integer> verticalOrder(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null) return list;
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>(); //<Position , root.val>
        Queue<Pair> q = new LinkedList<>(); // pair < root, position>
        q.add(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair pair = q.poll();
            TreeNode node = pair.node;
            int line = pair.position;

            ArrayList<Integer> mapList = map.getOrDefault(line, new ArrayList<>());
            mapList.add(node.val);
            map.put(line, mapList);

            if (node.left != null) {
                q.add(new Pair(node.left, line - 1));
            }
            if (node.right != null) {
                q.add(new Pair(node.right, line + 1));
            }
        }

        for (ArrayList<Integer> list1 : map.values()) {
            list.addAll(list1);
        }

        return list;
    }
}
