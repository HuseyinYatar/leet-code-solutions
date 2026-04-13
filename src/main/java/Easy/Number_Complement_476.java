package Easy;

public class Number_Complement_476 {
    public static void main(String[] args) {

    }
    public int findComplement(int num) {
        String str = Integer.toBinaryString(num);
        StringBuilder reversed=new StringBuilder(str.length());
        for(char c : str.toCharArray())
        {
            reversed.append((c == '0') ? '1' : '0');
        }
        return Integer.parseInt(reversed.toString(), 2);
    }
}
