package tech.blueglacier.DynamicProgramming;

// jump of 1 or 2 is allowed

public class FrogJump {
    public void printLeastCostOfTotalJump(int[] arr , int n){
        int prev2 = 0;
        int prev1 = 0 ;
        for (int i = 1; i < n; i++) {
            int firstStep = prev1 + Math.abs(arr[i] - arr[i - 1]);
            int secondStep = 0;
            if (i > 1) {
                secondStep = prev2 + Math.abs(arr[i] - arr[i - 2]);
            }
            int curr = Math.min(firstStep, secondStep);
            prev2 = prev1;
            prev1 = curr;
        }
        System.out.println(prev1);
    }
}
