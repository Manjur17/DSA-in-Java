package BinarySearchTrees;

import java.util.Stack;

public class TwoSum {
    public boolean findTarget(TreeNode root, int k) {
        if (root == null){
            return false;
        }
        TwoSumIterator l = new TwoSumIterator(root,false);
        TwoSumIterator r = new TwoSumIterator(root,true);
        int i = l.next();
        int j = r.next(); //before()
        while (i < j){
            if (i + j == k){
                return true;
            }else if (i + j < k){
                i = l.next();
            }else {
                j = r.next();
            }
        }
        return false;
    }
}
  class TwoSumIterator {
    private Stack<TreeNode> stack = new Stack<TreeNode>();
    boolean reverse = true;
    public TwoSumIterator(TreeNode root, boolean isReverse) {
        reverse = isReverse;
        pushAll(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode tmpNode = stack.pop();
        if (!reverse) {
            pushAll(tmpNode.right);
        }else {
            pushAll(tmpNode.left);
        }
        return tmpNode.val;
    }

    private void pushAll(TreeNode node) {
//        for (; node != null; stack.push(node), node = node.left);
        while (node != null){
            stack.push(node);
            if (!reverse) {
                node = node.left;
            }else {
                node = node.right;
            }
        }
    }
}


