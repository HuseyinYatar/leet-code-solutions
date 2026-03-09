package Easy;

import java.util.HashSet;

public class SingleNumber_136 {
  static  public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int i: nums)
        {
            if(set.contains(i))
            {
                set.remove(i);
            }
            else
                set.add(i);
        }
        return set.iterator().next();
    }

    public static void main(String[] args) {
        singleNumber(new int[]{1,2,1});
    }
}
