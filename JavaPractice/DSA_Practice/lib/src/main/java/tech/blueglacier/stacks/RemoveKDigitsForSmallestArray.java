package tech.blueglacier.stacks;

// remove "K" digits from a string to get the smallest string possible
// string = "34672" (make smallest number out of it)

import java.util.Stack;

public class RemoveKDigitsForSmallestArray {
    public String removeKDigits(String str, int K) {
        int n = str.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char curr = str.charAt(i);
            while (!st.isEmpty() && K > 0 && st.peek() > curr) {
                st.pop();
                K--;
            }
            st.push(curr);
        }
        // Remove remaining K digits from end
        while (K > 0 && !st.isEmpty()) {
            st.pop();
            K--;
        }
        // Build result from stack
        StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.append(st.pop());
        }
        res.reverse();
        // Remove leading zeros
        while (res.length() > 0 && res.charAt(0) == '0') {
            res.deleteCharAt(0);
        }
        if (res.length() == 0) {
            return "0";
        }
        return res.toString();
    }
}
