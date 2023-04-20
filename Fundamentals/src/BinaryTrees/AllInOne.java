package BinaryTrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AllInOne {
    public static List<List<Integer>> preInPostTraversal(TreeNode root) {
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(1, root));
        List<Integer> preList = new ArrayList<>();
        List<Integer> inList = new ArrayList<>();
        List<Integer> postList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }

        while (!st.isEmpty()) {
            Pair tempPair = st.pop();
            if (tempPair.num == 1) {
                //add for pre
                preList.add(tempPair.node.val);
                tempPair.num++;
                st.push(tempPair);
                //now push the left to the stack as it pre-order
                if (tempPair.node.left != null) {
                    st.push(new Pair(1, tempPair.node.left));
                }
            } else if (tempPair.num == 2) {
                //add for in
                inList.add(tempPair.node.val);
                tempPair.num++;
                st.push(tempPair);
                //now push the right to the stack as it in order
                if (tempPair.node.right != null) {
                    st.push(new Pair(1, tempPair.node.right));
                }
            } else {
                postList.add(tempPair.node.val);
            }
        }
        list.add(inList);
        list.add(preList);
        list.add(postList);
        return list;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preInPostTraversal(root));
    }

    static class Pair {
        int num;
        TreeNode node;

        public Pair(int i, TreeNode node) {
            this.num = i;
            this.node = node;
        }
    }
}
