package Easy;

import java.util.HashMap;
import java.util.Stack;

public class Decrypt_String_from_Alphabet_to_Integer_Mapping_1309 {

  static  public String freqAlphabets(String s) {
      int count=0;
      char[] input=s.toCharArray();

      HashMap<String, Character> map = new HashMap<>();

      map.put("10", 'j');
      map.put("11", 'k');
      map.put("12", 'l');
      map.put("13", 'm');
      map.put("14", 'n');
      map.put("15", 'o');
      map.put("16", 'p');
      map.put("17", 'q');
      map.put("18", 'r');
      map.put("19", 's');
      map.put("20", 't');
      map.put("21", 'u');
      map.put("22", 'v');
      map.put("23", 'w');
      map.put("24", 'x');
      map.put("25", 'y');
      map.put("26", 'z');

      StringBuilder st=new StringBuilder();

      for(int i=input.length-1;i>-1;i--)
      {
          if(input[i]=='#')
          {
        st.append(map.get(String.valueOf(input[i - 2]) + input[i - 1]));
        i=i-2;
          }
        else{
              char tmp=(char)(96+input[i]-'0');
              st.append(tmp);
          }

      }

    return st.reverse().toString();
    }

    public static void main(String[] args) {
System.out.println(        freqAlphabets("10#11#12")
);
    }
}
