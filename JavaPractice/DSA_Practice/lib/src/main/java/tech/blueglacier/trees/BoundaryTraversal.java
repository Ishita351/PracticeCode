package tech.blueglacier.trees;

// anti - clockwise traversal (left , leaves of left, leaves of right, right)

import java.util.ArrayList;

public class BoundaryTraversal {
    public void addLeftBoundary(Node root, ArrayList<Integer> result) {
        Node curr = root.left;
        while (curr != null) {
            if (curr.left != null || curr.right != null) { // not leaf node
                result.add(curr.data);
            }
            if (curr.left != null) {
                curr = curr.left;
            } else {
                curr = curr.right;
            }
        }
    }

    public void addRightBoundary(Node root, ArrayList<Integer> result) {
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        while (curr != null) {
            if (curr.left != null || curr.right != null) { // not leaf node
                temp.add(curr.data);
            }
            if (curr.right != null) {
                curr = curr.right;
            } else {
                curr = curr.left;
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            result.add(temp.get(i));
        }
    }

    public void addLeaves(Node root, ArrayList<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(root.data);
            return;
        }
        if (root.left != null) {
            addLeaves(root.left, result);
        }
        if (root.right != null) {
            addLeaves(root.right, result);
        }
    }

    ArrayList<Integer> printBoundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node.left != null || node.right != null) {
            ans.add(node.data);
        }
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }
}
