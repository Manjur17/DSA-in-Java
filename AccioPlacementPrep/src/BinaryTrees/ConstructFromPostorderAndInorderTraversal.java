package BinaryTrees;

import java.util.HashMap;

public class ConstructFromPostorderAndInorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }

        return buildHelper(postorder, 0, postorder.length - 1, inorder, 0, inorder.length - 1, map);
    }

    public TreeNode buildHelper(int[] postOrder, int postStart, int postEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map) {
        if (postStart > postEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(postOrder[postEnd]);
        int inRootIndex = map.get(root.val);
        int diff = inRootIndex - inStart;

        root.left = buildHelper(postOrder, postStart, postStart + diff - 1, inorder, inStart, inRootIndex - 1, map);
        root.right = buildHelper(postOrder, postStart + diff, postEnd - 1, inorder, inRootIndex + 1, inEnd, map);

        return root;
    }

}
