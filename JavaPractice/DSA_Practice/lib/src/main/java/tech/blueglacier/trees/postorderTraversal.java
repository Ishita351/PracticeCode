package tech.blueglacier.trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class postorderTraversal {
    void postorder(Node node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.println(node);
    }

    public List<Integer> postorderIterative(Node root) {
        Stack<Node> st = new Stack<>();
        List<Integer> postorder = new ArrayList<>();
        Node curr = root;
        while (curr != null || !st.isEmpty()) {
            if (curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                Node temp = st.peek().right;
                if (temp == null) {
                    temp = st.peek();
                    st.pop();
                    postorder.add(temp.data);
                    while (!st.isEmpty() && temp == st.peek().right ) {
                        temp = st.peek();
                        st.pop();
                        postorder.add(temp.data);
                    }
                }else{
                    curr = temp;
                }
            }
        }
        return postorder;
    }
}
