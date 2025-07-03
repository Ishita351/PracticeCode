package tech.blueglacier.stacks;

//For each subarray, we find the minimum element, then sum all those minimums.

public class SumOfSubArrayMinimums {
    public static int sumArrays(int[] arr) {
        int sum = 0;
        int n = arr.length;
        int[] nse = NextSmallerElement.findNSEIndexes(arr);
        int[] pse = PreviousSmallerElement.findPSEIndexes(arr);
        int mod = (int) (1e9 + 7); // mod = infinity
        for (int i = 0; i < n; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            sum = (sum + (left * right * arr[i]) % mod) % mod;
        }
        return sum;
    }
}

