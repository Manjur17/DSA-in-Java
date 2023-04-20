package BinaryTrees;

import java.util.Scanner;

public class BuildingOurTree {
    public static void printTree(TreeNode root){
        if (root == null){
            return;
        }
        System.out.print(root.val);
        if (root.left != null){
            System.out.print("-> L:" + root.left.val);
        }
        if (root.right != null){
            System.out.print(",R:" + root.right.val);
        }
        System.out.println();
        printTree(root.left);
        printTree(root.right);
    }
    public static TreeNode takeInput(boolean isRoot,int parentData,boolean isLeft){
        if (isRoot){
            System.out.println("Enter the root element");
        }else{
            if (isLeft){
                System.out.println("Enter the left child of " + parentData);
            }else {
                System.out.println("Enter the right child of " + parentData);
            }
        }
        Scanner s = new Scanner(System.in);
        int rootData = s.nextInt();
        if (rootData == -1){
            return null;
        }
        TreeNode root = new TreeNode(rootData);
        TreeNode leftChild = takeInput(false,rootData,true);
        TreeNode rightChild = takeInput(false,rootData,false);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = takeInput(true,0,false);
        printTree(root);
    }
}
