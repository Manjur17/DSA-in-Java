package BinarySearchTree;

public class ConstructBSTFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        int[] index = {0};
        return buildTree(preorder, index, Integer.MAX_VALUE);
    }

    private TreeNode buildTree(int[] arr, int[] index, int bound) {
        if (index[0] >= arr.length || arr[index[0]] >= bound)
            return null;

        TreeNode root = new TreeNode(arr[index[0]]);
        index[0]++;

        root.left = buildTree(arr, index, root.val);
        root.right = buildTree(arr, index, bound);

        return root;
    }

    public TreeNode bstFromPreorderBrute(int[] preorder) {
        TreeNode root = null;
        for (int x : preorder) {
            root = insertIntoBST(root, x);
        }
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        TreeNode node = root;
        while (true) {
            if (node.val == val) break;

            if (node.val < val) {
                //go to right
                if (node.right != null) {
                    node = node.right;
                } else {
                    node.right = new TreeNode(val);
                    break;
                }
            } else {
                //go to left
                if (node.left != null) {
                    node = node.left;
                } else {
                    node.left = new TreeNode(val);
                    break;
                }
            }
        }
        return root;
    }
}
