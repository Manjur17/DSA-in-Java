package BinaryTrees;

public class CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftHeight = getLeftHeight(root);
        int rightHeight = getRightHeight(root);
        if (leftHeight == rightHeight){
            return (2 << leftHeight) -1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    private int getRightHeight(TreeNode root) {
        int count=0;
        while(root.left!=null){
            count++;
            root = root.left;
        }
        return count;
    }

    private int getLeftHeight(TreeNode root) {
        int count=0;
        while(root.right!=null){
            count++;
            root = root.right;
        }
        return count;
    }
}
