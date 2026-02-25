package org;

import java.util.*;
public class decompressRLElist {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(solution(arr)));

    }
   static public int[] solution(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i=i+2)
        {
            for(int j=0;j<nums[i];j++)
            {
                list.add(nums[i+1]);

            }
        }
        return  list.stream().mapToInt(i -> i).toArray();
    }
}
