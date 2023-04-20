package BinaryTrees;

public class SerializeAndDeserializeBinaryTree {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder ans = new StringBuilder();
        serializeHelper(root, ans);
        return ans.toString();
    }

    private void serializeHelper(TreeNode root, StringBuilder ans) {
        if (root == null) {
            ans.append("*").append(" ");
            return;
        }
        ans.append(root.val).append(" "); //to apply split() method in deserialize and take care of -ve
        serializeHelper(root.left, ans);
        serializeHelper(root.right, ans);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] arr = data.split(" ");
        int[] index = {0};
        return deserializeHelper(arr, index);
    }

    private TreeNode deserializeHelper(String[] arr, int[] index) {
        if (index[0] == arr.length)
            return null;

        String s = arr[index[0]++];
        if (s.equals("*"))
            return null;

        int num = Integer.parseInt(s);

        TreeNode root = new TreeNode(num);
        root.left = deserializeHelper(arr, index);
        root.right = deserializeHelper(arr, index);
        return root;
    }
}
