package tech.blueglacier.stacks;

import java.util.Stack;

// return minimum value of the stack
// 2*val - mini = A way to store the previous minimum value without using extra space or another stack.

public class MinStack {
        Stack<Integer> st = new Stack<>();
        int mini = Integer.MAX_VALUE;
        void push(int val){
            if(st.isEmpty()){
                mini=val;
                st.push(val);
            }else{
                if(val>mini){

                    st.push(val);
                }else{
                    st.push((2*val) - mini);
                    mini = val;
                }
            }
        }
        void pop(){
            if(st.isEmpty()){
                return ;
            }
            int x = st.peek();
            st.pop();
            if(x<mini){
                mini = 2*mini -x;
            }
        }
        int top(){
            if(st.isEmpty()){
                return 0;
            }
            int x = st.peek();
            if(x<mini){
                return x;
            }
            return mini;
        }
        int getMin(){
            return mini;
        }

}
