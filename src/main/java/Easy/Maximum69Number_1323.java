package Easy;

public class Maximum69Number_1323 {

    public static void main(String[] args) {
        maximum69Number(6669);
    }

    static public int maximum69Number(int num) {
        String s = Integer.toString(num);
        String s1 = s.replaceFirst("6", "9");

        return Integer.parseInt(s1);
    }
}
