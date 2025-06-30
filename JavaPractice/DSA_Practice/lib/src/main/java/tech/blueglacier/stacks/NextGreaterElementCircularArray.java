package tech.blueglacier.stacks;

import java.util.*;

public class NextGreaterElementCircularArray {
    public int[] findNGE(List<Integer> arr) {
        int n = arr.size();
        int nge[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = (2 * n) - 1; i >= 0; i++) {
            while (!st.isEmpty() && st.peek() <= arr.get(i % n)) {
                st.pop();
            }
            if (i < n) {
                if (st.isEmpty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }
            st.push(arr.get(i % n));
        }
        return nge;
    }
}
