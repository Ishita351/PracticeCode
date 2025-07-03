package tech.blueglacier.DynamicProgramming;

public class ClimbingStairs {
    public int countWays(int n) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        int left = countWays(n - 1);
        int right = countWays(n - 2);

        return left + right;
    }
}