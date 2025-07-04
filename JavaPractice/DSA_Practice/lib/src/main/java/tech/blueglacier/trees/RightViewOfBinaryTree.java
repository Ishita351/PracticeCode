package tech.blueglacier.trees;

import java.util.ArrayList;
import java.util.List;

public class RightViewOfBinaryTree {
    public void getRightView(Node curr , List<Integer> result, int currDepth){
        if(curr== null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        getRightView(curr.right,result,currDepth+1);
        getRightView(curr.left,result,currDepth+1);
    }
    public List<Integer> rView(Node root){
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        getRightView(root,res,0);
        return res;
    }
}
