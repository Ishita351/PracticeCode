package tech.blueglacier.DynamicProgramming;

public class Fibonacci {
    public void printFibo(int n){
        int[] dp = new int[n+1];
        for (int i = 2; i < n+1; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;
        dp[1] = 1 ;
        for (int i = 2; i < n+1; i++) {
            dp[i] =  dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);
    }
    //optimal :
    public void printFibonacci(int n){
        int prev2 = 0;
        int prev1 = 1 ;
        for (int i = 2; i < n+1; i++) {
            int curr = prev1 + prev2;
            prev2 =prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
