package Easy;

import java.util.ArrayList;
import java.util.List;

public class Self_Dividing_Numbers_728 {
    public static List<Integer> solution(int left, int right) {

        List<Integer> res = new ArrayList<>();
        int digit = 0;
        boolean selfDividingNumb = true;
        for (int i = left; i <= right; i++) {
            int tmp = i;
            selfDividingNumb=true;
           try {
               if(tmp==11)
                  System.out.println("qwe");
               while (tmp != 0) {
                   digit = tmp % 10;
                   if(digit==0)
                   {
                       selfDividingNumb=false;
                       break;
                   }
                   if (i /digit == 0) {
                       selfDividingNumb = false;
                       break;
                   }
                   tmp /= 10;
               }
           } catch (RuntimeException e) {
               System.out.println(tmp);
               System.out.println(digit);
           }
            if (selfDividingNumb)
                res.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        solution(1, 22);
    }
}
