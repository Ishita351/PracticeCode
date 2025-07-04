package tech.blueglacier.DynamicProgramming;

// max sum of non adjescent elements but the first and last cant be in the same ans as the array is circular and they will be adjescent
// so we run the same prog for 2 arrays , one doesn't contain the first element and the other doesn't contain the last element

import java.util.ArrayList;
import java.util.List;

public class MaxSumCircularArray {
    public static int maximumNonAdjacentSum(List<Integer> nums) {
        int n = nums.size();
        int prev = nums.get(0);
        int prev2 = 0;

        for (int i = 1; i < n; i++) {
            int take = nums.get(i);
            if (i > 1) take += prev2;

            int notTake = 0 + prev;
            int curi = Math.max(take, notTake);
            prev2 = prev;
            prev = curi;
        }
        return prev;
    }
    public static int mainMethodForAns(List<Integer> ansList) {
        int n = ansList.size();
        if (n == 1) return ansList.get(0);

        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i != 0) temp1.add(ansList.get(i));
            if (i != n - 1) temp2.add(ansList.get(i));
        }

        return Math.max(maximumNonAdjacentSum(temp1), maximumNonAdjacentSum(temp2));
    }

}

