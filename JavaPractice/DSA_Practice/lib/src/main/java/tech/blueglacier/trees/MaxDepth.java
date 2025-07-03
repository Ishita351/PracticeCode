package tech.blueglacier.trees;

// find max height of tree

public class MaxDepth {
    public int maxDepthOfTree(Node node){
        if(node == null){
            return 0;
        }
        int left = maxDepthOfTree(node.left);
        int right = maxDepthOfTree(node.right);
        return 1 + Math.max(left,right);
    }
}
