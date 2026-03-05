package Easy;

public class Reverse_Words_in_a_String_III_557 {
    public static void main() {
        System.out.println(reverseWords("Let's take LeetCoXe contest"));
    }

    static public String reverseWords(String s) {
        StringBuilder st = new StringBuilder(s.length());
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            st.append((new StringBuilder(words[i])).reverse());
            if (words.length - 1 != i)
                st.append(" ");
        }

        return st.toString();
    }
}
