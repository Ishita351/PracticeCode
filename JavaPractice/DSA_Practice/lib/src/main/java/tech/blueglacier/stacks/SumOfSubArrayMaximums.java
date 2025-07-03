package tech.blueglacier.stacks;

public class SumOfSubArrayMaximums {
    public static int sumArrays(int[] arr){
        int sum = 0;
        int n = arr.length;
        int[] nge = NextGreaterElement.findNGEIndexes(arr);
        int[] pge = PreviousGreaterElement.findPGEIndexes(arr);
        int mod = (int) (1e9 + 7); // mod = infinity
        for (int i = 0; i < n; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            sum = (sum + (left * right * arr[i]) % mod) % mod;
        }
        return sum;
    }
}
