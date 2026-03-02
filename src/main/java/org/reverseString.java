package org;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        solution(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    static public void solution(char[] s) {
        Stack<Character> st = new Stack<>();
        for (Character c : s) {
            st.push(c);
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = st.pop();
        }

    }
}
