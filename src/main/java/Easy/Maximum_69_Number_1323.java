package Easy;

public class Maximum_69_Number_1323 {

    public static void main(String[] args) {
        maximum69Number(9669);
    }

    static public int maximum69Number(int num) {
        int digit = 0;
        int i = 0;
        int res = num;
        boolean first=false;
        while (num != 0) {
            if (num % 10 == 6)
            {
                digit = i;
                first=true;
            }
            num = num / 10;
            i++;
        }
        return digit != 0||first==true ? ((int) (res + Math.pow(10, digit) * 3)) : res;

    }
}
