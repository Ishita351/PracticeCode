package tech.blueglacier.trees;

import java.util.*;

public class ZigZagTraversal {
    public List<List<Integer>> zigZagTraversal(Node root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean LtoR = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> row = new ArrayList<>(Collections.nCopies(size, 0));
            for (int i = 0; i < size; i++) {
                int index;
                Node node = q.remove();
                if(LtoR) {
                    index = i;
                }else{
                    index = size -i-1;
                }
                row.set(index, node.data);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            LtoR = !LtoR;
            result.add(row);
        }
        return result;
    }
}
