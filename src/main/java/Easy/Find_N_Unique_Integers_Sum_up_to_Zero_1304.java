package Easy;

public class Find_N_Unique_Integers_Sum_up_to_Zero_1304 {
    public int[] sumZero(int n) {
        int []res=new int[n];
        for(int l=0,r=res.length-1,val=res.length/2;l< r;l++,r--,val--)
        {
            res[l]=val;
            res[r]=-val;
        }
        return res;
    }
}
