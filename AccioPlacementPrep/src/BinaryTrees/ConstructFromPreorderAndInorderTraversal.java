package BinaryTrees;

import java.util.HashMap;

public class ConstructFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildHelper(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode buildHelper(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if (preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRootIndex = map.get(root.val);
        int diff = inRootIndex - inStart;

        root.left = buildHelper(preorder, preStart + 1, preStart + diff, inorder, inStart, inRootIndex - 1, map);
        root.right = buildHelper(preorder, preStart + diff + 1, preEnd, inorder, inRootIndex + 1, inEnd, map);

        return root;
    }
}
