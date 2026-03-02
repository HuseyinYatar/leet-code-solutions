package org;

public class reverseString {
    public static void main(String[] args) {
        solution(new char[]{'h', 'e','l', 'l', 'o'});
    }

    static public void solution(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}