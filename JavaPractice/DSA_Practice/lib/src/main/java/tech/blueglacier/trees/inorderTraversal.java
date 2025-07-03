package tech.blueglacier.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class inorderTraversal {
    void inorder(Node node){
        if(node== null){
            return;
        }
        inorder(node.left);
        System.out.println(node);
        inorder(node.right);
    }

    public List<Integer> inorderIterative(Node root){
        List<Integer> inorder = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node node = root;
        while(true){
            if(node!=null){
                st.push(node);
                node = node.left;
            }else{
                if(st.isEmpty()){
                    break;
                }
                node = st.pop();
                inorder.add(node.data);
                node=node.right;
            }
        }
        return inorder;
    }
}
