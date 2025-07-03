package tech.blueglacier.stacks;

import java.util.Stack;

public class NextGreaterElement {
    public int[] findNGE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ansList[] = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ansList[i] = n;
            }else{
                ansList[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ansList;
    }
    public static int[] findNGEIndexes(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // Stack stores indices

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;  // No greater element → use n as sentinel index
            } else {
                ans[i] = st.peek();  // Index of next greater element
            }
            st.push(i); // Push current index
        }

        return ans;
    }

}
