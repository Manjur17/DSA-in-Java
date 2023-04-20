package BinaryTrees;

import java.util.ArrayList;

public class PostOrderMorrisTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        while(root != null)
        {
            TreeNode curr = root;//We will create thread from left most node of right subtree to present node and will
            //travel to that node using curr
            if(curr.right != null)//if root has right child
            //We can't push directly this root node val to ans as we are not sure whether we are here
            //thorough thread link after covering right subtree or we are here for the first time
            {
                curr = curr.right;
                while(curr.left != null && curr.left != root)//go to left most node of right subtree
                    curr=curr.left;
                if(curr.left != root)//not threaded yet
                {
                    ans.add(root.val);//it means root was visited for first time and this is modified preorder hence
                    //push this node's val to ans
                    curr.left = root;//create the thread
                    root = root.right;//go to right to cover right subtree as modified preorder is root->right->left
                }
                else//was threaded
                {
                    curr.left = null;//break the thread
                    root = root.left;//right subtree has been covered hence now cover the left one
                    //no need to push this node value as we are here for the second time using thread
                    //link
                }
            }
            else//root hasn't right child
            {
                ans.add(root.val);//modified preorder is root->right->left hence push this value before going towards left
                root = root.left;
            }
        }
//        reverse(ans.begin(),ans.end());//reversing root->right->left to left->right->root to make it post order
        return ans;
    }
}
