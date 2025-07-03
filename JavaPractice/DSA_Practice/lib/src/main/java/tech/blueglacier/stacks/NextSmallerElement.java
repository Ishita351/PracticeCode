package tech.blueglacier.stacks;

import java.util.List;
import java.util.Stack;

public class NextSmallerElement {
    public static int[] findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ansList[] = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            while(!st.isEmpty() && st.peek() > arr[i]){
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
    public static int[] findNSEIndexes(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // Stack stores indices

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                ans[i] = n;  // no smaller element to the right → use n (like virtual index)
            } else {
                ans[i] = st.peek();  // index of next smaller element
            }
            st.push(i); // push current index
        }

        return ans;
    }

}
