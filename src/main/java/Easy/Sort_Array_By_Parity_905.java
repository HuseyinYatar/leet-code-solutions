package Easy;

public class Sort_Array_By_Parity_905 {
    public static void main(String[] args) {
        solution(new int[]{1, 0});
    }

    static public int[] solution(int[] nums) {
        for (int i = 0, j = nums.length - 1; i < j; i++) {
            if (nums[i] % 2 == 1) {
                while (nums[j] % 2 != 0 && i < j) {
                    j--;
                }
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }
}
