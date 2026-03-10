package Easy;

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {

        int[] temp={555,901,482,1771};
    }
    static public int solution(int[] nums) {
        int count=0;
        for(Integer n: nums)
        {
            if((9<n&&n<100)||(999<n&&n<10000)||n==100000)
                count++;
        }
        return count;
    }
}
