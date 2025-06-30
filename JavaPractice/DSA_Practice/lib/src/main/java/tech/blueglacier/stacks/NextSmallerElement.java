package tech.blueglacier.stacks;

import java.util.List;
import java.util.Stack;

public class NextSmallerElement {
    public int[] findNSE(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int ansList[] = new int[n];
        for (int i = n-1; i >=0 ; i--) {
            while(!st.isEmpty() && st.peek() > arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ansList[i] = -1;
            }else{
                ansList[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return ansList;
    }
}
