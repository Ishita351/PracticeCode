package tech.blueglacier.trees;

// Balance BT = [height(left) - height(right)] is at most 1.

public class CheckBalancedBinaryTree {
    int checkBalancy(Node node) {
        if (node == null) {
            return 0;
        }
        int left = checkBalancy(node.left);
        int right = checkBalancy(node.right);
        if (left == -1 || right == -1) {
            return -1;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return (Math.max(left, right) + 1);
    }
}
