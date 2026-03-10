package Easy;

import java.util.HashSet;

public class Unique_Morse_Code_Words_804 {

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"qq","qq","qq","qq"}));
    }

    static public int solution(String[] words) {

        String[] letters={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String s:words)
        {
            StringBuilder sd=new StringBuilder();
            for(int i=0;i<s.length();i++)
            {
                int val=s.charAt(i)-'a';
                sd.append(letters[val]);
            }
            set.add(sd.toString());
        }
        return set.size();
    }
}
