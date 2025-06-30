package tech.blueglacier.stacks;

// each element represents the int value of bar graph height

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int findMaxArea(int[] arr) {
        int maxArea = 0;
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                int element = st.pop();
                int nse = i;
                int pse = st.isEmpty() ? -1 : st.peek();
                int area = arr[element] * (nse - pse - 1);
                maxArea = Math.max(maxArea, area);
            }
            st.push(i);
        }
        // Process remaining elements in stack
        while (!st.isEmpty()) {
            int element = st.pop();
            int nse = n;
            int pse = st.isEmpty() ? -1 : st.peek();
            int area = arr[element] * (nse - pse - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
