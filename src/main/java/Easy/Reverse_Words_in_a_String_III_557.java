package Easy;

public class Reverse_Words_in_a_String_III_557 {
    public static void main() {
        System.out.println(reverseWords("Let's take LeetCoXe contest"));
    }

    static public String reverseWords(String s) {
        char[] array = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(s.length());
        int tmp = 0;
        for (int i = 0, j = 0; i < s.length()-1; i++) {

            if (array[i+1] == ' ') {
                tmp = i + 2;
                while (i >= j) {
                    stringBuilder.append(array[i]);
                    i--;
                }
                stringBuilder.append(' ');
                j = tmp;
                i=tmp;
            }
        }
        int i=s.length()-1;

        while(array[i]!=' ')
        {
            stringBuilder.append(array[i]);
            i--;
            if(i<0)
                return stringBuilder.toString();


        }
        return stringBuilder.toString();
    }
}
