package Easy;

public class Remove_Outermost_Parentheses_1021 {

    public static void main(String[] args) {

        removeOuterParentheses("(()())(())");
        removeOuterParentheses("()()");
    }

    static public String removeOuterParentheses(String s) {

        int count = -1;
        StringBuilder st = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == '(') {
                count++;
                if (count != 0)
                    st.append(c);
            }
            else
            {
                if (count != 0)
                    st.append(c);
                count--;
            }
        }
        return st.toString();
    }
}
