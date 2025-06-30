package tech.blueglacier.stacks;

import java.util.Stack;

public class PreviousSmallerElement {
    public int[] findPSE(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ;i<n ;i++) {
            while (!st.isEmpty() && st.peek() > arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ans;
    }
}
