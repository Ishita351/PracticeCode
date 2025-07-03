package tech.blueglacier.trees;

// find the longest path between any 2 nodes
// not necessary to pass through center

public class DiameterOFBinaryTree {
    public int findMax(Node node , int[] maxi){
        if(node == null){
            return 0;
        }
        int left = findMax(node.left , maxi);
        int right = findMax(node.right , maxi);
        maxi[0] = Math.max(maxi[0], left+right);
        return 1+Math.max(left,right);
    }
    public int maxDiameter(Node root){
        int[] maxi = new int[1];
        findMax(root,maxi);
        return maxi[0];
    }
}
