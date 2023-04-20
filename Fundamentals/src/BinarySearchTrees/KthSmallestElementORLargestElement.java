package BinarySearchTrees;

import java.util.Stack;

public class KthSmallestElementORLargestElement {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        int count = 0;
        while(true){
            if(node != null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                count++;
                if(count == k) {
                    return node.val;
                }
                node = node.right;
            }
        }
        return -1;
    }
    public int kthLargest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        int count = 0;
        while(true){
            if(node != null){
                stack.push(node);
                node = node.right;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                count++;
                if(count == k) {
                    return node.val;
                }
                node = node.left;
            }
        }
        return -1;
    }
}
