package tech.blueglacier.trees;

import java.util.*;

public class BottomViewOfBinaryTree {
    public ArrayList<Integer> bottomView(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        Map<Integer,Integer> map = new TreeMap<>();
        Queue<Node> q = new LinkedList<>();
        root.hd = 0;
        q.add(root);
        while(!q.isEmpty()){
            Node temp = q.poll();
            int hd = temp.hd;
            map.put(hd, temp.data);
            if(temp.left!=null){
                temp.left.hd = hd -1;
                q.add(temp.left);
            }
            if(temp.right!=null){
                temp.right.hd =  hd+1;
                q.add(temp.right);
            }
        }
        for (int value : map.values()) {
            ans.add(value);
        }
        return ans;
    }
}
/*
class NodeHD{
    int data;
    NodeHD left;
    NodeHD right;
    int hd;
    public NodeHD(int data , int hd){
        this.data = data;
        this.hd = hd;
    }
}

 */