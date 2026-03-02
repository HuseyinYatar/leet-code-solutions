package Easy;

import java.util.*;
public class decompressRLElist {
    public static void main(String[] args) {
        int x=5^1;
        int[] arr={1,2,3,4};
        System.out.println(Arrays.toString(solution(arr)));

    }
   static public int[] solution(int[] nums) {int length = 0;


       for (int i = 0; i < nums.length - 1; i = i + 2) {
           length += nums[i];
       }
       int[] arr = new int[length];

       int z = 0;
       for (int i = 0; i < nums.length - 1; i=i+2) {
           for (int j = 0; j < nums[i]; j++) {
               arr[z] = nums[i + 1];
               z++;
           }
       }
       return arr;
    }
}
