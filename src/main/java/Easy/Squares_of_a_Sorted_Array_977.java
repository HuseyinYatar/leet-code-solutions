package Easy;

import java.util.Arrays;

public class Squares_of_a_Sorted_Array_977 {
    public static void main(String[] args) {
System.out.println(Arrays.toString(sortedSquares(new int[]{-7,-3,2,3,11})));    }

    static public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int i=nums.length-1;
        int[] res=new int[nums.length];
        while(i!=-1)
        {
            if(Math.abs(nums[l])> Math.abs(nums[r]))
            {
            res[i]=(int) Math.pow(nums[l],2);
            i--;
            l++;
            }
            else if (Math.abs(nums[l])< Math.abs(nums[r]))
            {
                res[i]=(int) Math.pow(nums[r],2);
                i--;
                r--;
            }
            else
            {
                res[i]=(int) Math.pow(nums[r],2);
                i--;
                if(i==-1)
                    break;
                res[i]=(int) Math.pow(nums[l],2);
                i--;
                r--;
                l++;
            }
        }
        return res;
    }
}
