package BinaryTrees;

import java.util.ArrayList;

public class PathToGivenNode {

    public ArrayList<Integer> solve(TreeNode A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        if (A == null){
            return list;
        }
        getPath(A,list,B);
        return list;
    }

    private boolean getPath(TreeNode node, ArrayList<Integer> list, int x) {
        if (node == null){
            return false;
        }
        list.add(node.val);
        if (node.val == x){
            return true;
        }
        if (getPath(node.left,list,x) || getPath(node.right,list,x)){
            return true;
        }
        //our answer is not found so remove the last element of the list
        list.remove(list.size()-1);
        return false;
    }
}
