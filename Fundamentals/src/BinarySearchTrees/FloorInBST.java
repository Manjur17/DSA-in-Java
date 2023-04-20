package BinarySearchTrees;

public class FloorInBST {
    public static int floorInBST(TreeNode root, int x) {
        //    Write your code here.
        int floor = -1;
        while (root != null){
            if (root.val == x){
                floor = root.val;
                return floor;
            }
            if (x > root.val){
                floor = root.val;
                root = root.right;
            }else {
                root = root.left;
            }
        }
        return floor;
    }
}
