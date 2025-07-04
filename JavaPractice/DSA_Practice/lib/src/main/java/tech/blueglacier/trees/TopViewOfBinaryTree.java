package tech.blueglacier.trees;

import java.util.*;

public class TopViewOfBinaryTree {
    public ArrayList<Integer> topView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            Pair it = q.poll();
            int hd = it.hd;
            Node temp = it.node;
            if(map.get(hd)==null){
                map.put(hd,temp.data);
            }
            if(temp.left!=null){
                q.add(new Pair(temp.left,hd-1));
            }
            if(temp.right!=null){
                q.add(new Pair(temp.right,hd+1));
            }
        }
        for (int value : map.values()) {
            ans.add(value);
        }
        return ans;
    }
}
class Pair{
    Node node;
    int hd; // horizontal depth
    Pair(Node node , int hd){
        this.node= node;
        this.hd = hd;
    }
}
