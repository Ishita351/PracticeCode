package tech.blueglacier.stacks;

import java.util.Stack;

public class PreviousSmallerElement {
    public static int[] findPSE(int[] arr){ // returns list of values
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

    public static int[] findPSEIndexes(int[] arr){ // retuens list of indexes
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // Stack of indices

        for(int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i); // push index
        }
        return ans;
    }

}
