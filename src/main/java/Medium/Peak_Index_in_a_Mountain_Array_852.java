package Medium;

public class Peak_Index_in_a_Mountain_Array_852 {
   static  public int peakIndexInMountainArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        int middle=(left+right)/2;

       while(right>left)
       {
           if(arr[middle-1]>arr[middle])
               right=middle;
           else if(arr[middle+1]>arr[middle])
           {
               left=middle;
           }
           else
           {
               return middle;
           }
            middle=(left+right)/2;

       }
       return middle;
    }

    public static void main(String[] args) {
    peakIndexInMountainArray(new int[]{24,69,100,99,79,78,67,36,26,19});
    }
}
