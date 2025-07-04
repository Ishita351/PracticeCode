package tech.blueglacier.recursion;

import java.util.List;

public class printArray {
    public void printSubsequenceWithSumK(int index , int[] arr , List<Integer> ds , int n , int s , int sum){
        if(index==n){
            if(s==sum){
                for(int it : ds){
                    System.out.println(it);
                }
                return;
            }
        }
        //pick
        ds.add(arr[index]);
        s += arr[index];
        printSubsequenceWithSumK(index+1 , arr , ds, n ,s, sum);
        //not pick
        s -= arr[index];
        ds.removeLast();
        printSubsequenceWithSumK(index+1 , arr , ds, n ,s, sum);
    }
}
