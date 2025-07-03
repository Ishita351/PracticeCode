package tech.blueglacier.stacks;
// sum of the ranges of each sub array
// ranges means the difference between the largest and smallest element of that sub array

public class SumOfSubArrayRanges {
    public int sumOfArrayRanges(int[] arr){
        int sumMin = SumOfSubArrayMinimums.sumArrays(arr);
        int sumMax = SumOfSubArrayMaximums.sumArrays(arr);
        return (sumMax - sumMin);
    }
}
