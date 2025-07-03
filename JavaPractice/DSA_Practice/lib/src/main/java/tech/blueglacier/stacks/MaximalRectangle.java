package tech.blueglacier.stacks;
// find the max rectangle in a 2-d matrix using the concept of largest rectangle in histogram and
// using prefix sum

public class MaximalRectangle {
    public int findMaxRectArea(int[][] matrix){
        int maxArea = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] prefixSum = new int[n][m];
        // traverse the columns
        for (int j = 0; j < m-1; j++) { // calc prefix sum
            int sum = 0 ;
            for (int i = 0; i < n-1; i++) {
                sum += matrix[i][j];
                if(matrix[i][j] == 0){
                    sum =0;
                }
                prefixSum[i][j] = sum;
            }
        }
        for (int i = 0; i < n-1; i++) {
            maxArea = Math.max(maxArea , LargestRectangleInHistogram.findMaxArea(prefixSum[i]));
        }
        return maxArea;
    }
}
