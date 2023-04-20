package BinaryTrees;


import java.util.*;

public class IterativePostOrder {
    public List<Integer> postorderTraversal1Stacks(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.isEmpty()) {
            root = st.pop();
            list.add(0, root.val); //we are basically reversing the list
            if (root.left != null) st.push(root.left);
            if (root.right != null) st.push(root.right);

        }
        //Collections.reverse(list);
        return list;
    }

    public List<Integer> postorderTraversal2Stacks(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<TreeNode> st1 = new Stack<>();
        Stack<TreeNode> st2 = new Stack<>();
        st1.push(root);
        while (!st1.isEmpty()) {
            root = st1.pop();
            st2.push(root);
            if (root.left != null) st1.push(root.left);
            if (root.right != null) st1.push(root.right);
        }

        while (!st2.isEmpty()) {
            list.add(st2.pop().val);
        }
        return list;
    }

}
