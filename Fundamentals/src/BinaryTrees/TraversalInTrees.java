package BinaryTrees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class TraversalInTrees {
    public void preOrderRecursive(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }
    //iterative using stack
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);
        while(!s.isEmpty()){
            root = s.pop();
            list.add(root.val);
            if (root.right != null){
                s.push(root.right);
            }
            if (root.left != null){
                s.push(root.left);
            }
        }
        return list;
    }
    public void inOrder(TreeNode root){
        if (root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.val);
        inOrder(root.right);
    }
    //iterative using stack
    public static List<Integer> inOrderIterative(TreeNode root){
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> s = new Stack<>();
        TreeNode node = root;
        while(true){
            if(node != null){
                s.push(node);
                node = node.left;
            }else {
                if (s.isEmpty()){
                    break;
                }
                node = s.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }
    public void postOrder(TreeNode root){
        if (root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.val);
    }
    //iterative using 2 stacks
    public static List<Integer> postOrderIterative(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root == null){
            return list;
        }
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        s1.push(root);
        while (!s1.isEmpty()){
            root = s1.pop();
            s2.push(root);
            if (root.left!=null){
                s1.push(root.left);
            }
            if (root.right!=null){
                s1.push(root.right);
            }
        }
        while (!s2.isEmpty()){
            list.add(s2.pop().val);
        }
        return list;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
        System.out.println(inOrderIterative(root));
        System.out.println(postOrderIterative(root));
    }
}
