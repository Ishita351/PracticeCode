package tech.blueglacier.DynamicProgramming;

// return max sum of non-adjacent elements of an array

public class MaxSum {
    public int returnMaxSumOfElements(int[] arr){
        int n = arr.length;
        int prev1 = arr[0];
        int prev2 = 0;
        for (int i = 1; i < n ; i++) {
            int take = arr[i] ;
            if(i>1){
                take += prev2;
            }
            int dontTake = 0 + prev1;
            int curr = Math.max(take, dontTake);
            prev2= prev1;
            prev1 = curr;
        }
        return prev1;
    }
}

