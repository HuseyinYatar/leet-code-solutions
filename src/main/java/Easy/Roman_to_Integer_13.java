package Easy;


import java.util.Map;

public class Roman_to_Integer_13 {
    public static void main(String[] args) {

        int x = romanToInt("MCDLXXVI");
    }

    static public int romanToInt(String s) {
        Map<String, Integer> romanMap = Map.of(
                "M", 1000,
                "D", 500,
                "C", 100,
                "L", 50,
                "X", 10,
                "V", 5,
                "I", 1
        );

        Map<String, Integer> specialRomanMap = Map.of(
                "CM", 900,
                "CD", 400,
                "XC", 90,
                "XL", 40,
                "IX", 9,
                "IV", 4
        );
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {

            String str = s.substring(i, i + 2);
            if (specialRomanMap.containsKey(str)) {
                sum += specialRomanMap.get(str);
                i++;
            } else {
                sum += romanMap.get(str.substring(0, 1));
            }
        }
        if (s.length() > 1 && !specialRomanMap.containsKey(s.substring(s.length() - 2))) {
            sum += romanMap.get(s.substring(s.length() - 1));
        }
        if (s.length() == 1)
            sum += romanMap.get(s);
        return sum;
    }
}