package tech.blueglacier.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {
    void preorder(Node node){
        if(node== null){
            return;
        }
        System.out.println(node);
        preorder(node.left);
        preorder(node.right);
    }

    List<Integer> preorderIterative(Node root){
        Stack<Node> st = new Stack<>();
        List<Integer> preorder =  new ArrayList<>();
        if (root == null) {
            return preorder;
        }
        st.push(root);
        while(!st.isEmpty()){
            root = st.pop();
            preorder.add(root.data);
            if(root.right != null){
                st.push(root.right);
            }
            if(root.left != null){
                st.push(root.left);
            }
        }
        return preorder;

    }
}
