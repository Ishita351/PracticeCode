package tech.blueglacier.trees;

// max sum that can be obtained in any path

public class MaxPathSum {
    public int maxSumOfPath(Node node, int[] maxi){
        if(node == null){
            return 0 ;
        }
        int left = Math.max(0, maxSumOfPath(node.left , maxi)); // we have taken 0 to ignore -ve valued nodes
        int right = Math.max(0, maxSumOfPath(node.right , maxi));
        maxi[0] = Math.max(maxi[0], left+right+node.data);
        return Math.max(left, right) + node.data;
    }
    public int pathSum(Node root){
        int[] maxi = new int[1];
        maxi[0] = Integer.MIN_VALUE;
        maxSumOfPath(root,maxi);
        return maxi[0]; // final answer
    }
}
