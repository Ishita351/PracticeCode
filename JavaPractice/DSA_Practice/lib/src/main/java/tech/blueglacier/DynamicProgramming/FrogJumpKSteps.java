package tech.blueglacier.DynamicProgramming;

public class FrogJumpKSteps {
    public void printLeastCostOfTotalJump(int[] arr , int n, int k){
        int[] dp = new int[n];
        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            int minSteps =Integer.MAX_VALUE;
            for (int j = 1; j <= k ; j++) {
                if(i-j>=0){
                    int jumpEnergy = dp[i-j] + Math.abs(arr[i] - arr[i-j]);
                    minSteps = Math.min(minSteps,jumpEnergy);
                }
            }
            dp[i] = minSteps;
        }
        System.out.println(dp[n-1]);
    }
}
