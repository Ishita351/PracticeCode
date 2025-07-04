package tech.blueglacier.trees;

import java.util.ArrayList;
import java.util.List;

public class LeftViewOfBinaryTree {
    public void getLeftView(Node curr , List<Integer> result, int currDepth){
        if(curr== null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.data);
        }
        getLeftView(curr.left,result,currDepth+1);
        getLeftView(curr.right,result,currDepth+1);
    }
    public List<Integer> lView(Node root){
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        getLeftView(root,res,0);
        return res;
    }
}
