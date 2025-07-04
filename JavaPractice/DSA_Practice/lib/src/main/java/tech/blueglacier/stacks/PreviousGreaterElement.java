package tech.blueglacier.stacks;

import java.util.List;
import java.util.Stack;

public class PreviousGreaterElement {
    public int[] findPGE(int[] arr){
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i =0 ;i<n ;i++) {
            while (!st.isEmpty() && st.peek() < arr[i]) {
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

    public static int[] findPGEIndexes(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // Stack stores indices
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = st.peek(); // index of previous greater element
            }
            st.push(i); // push current index
        }
        return ans;
    }

}
