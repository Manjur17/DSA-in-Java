package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class RightLeftView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        rightView(root,list,0);
        return list;
    }

    private void rightView(TreeNode root, List<Integer> list,int level) {
        if (root == null){
            return;
        }
        if (level == list.size()){
            list.add(root.val);
        }
        rightView(root.right,list,level+1);
        rightView(root.left,list,level+1);
    }
}
