package tech.blueglacier.stacks;

import java.util.Stack;

// Aestroid Collision happens when +ve and -ve integers of an array collide and the smaller one is bursted

public class AsteroidCollision {
    public Stack<Integer> findCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                st.push(arr[i]);
            } else {
                while (!st.isEmpty() && st.peek() > 0 && st.peek() < Math.abs(arr[i])) {
                    st.pop();
                }
                if (!st.isEmpty() && st.peek() == Math.abs(arr[i])) {
                    st.pop();
                } else if (st.isEmpty() || st.peek() < 0) {
                    st.push(arr[i]);
                }
            }
        }
        return st;
    }
}
