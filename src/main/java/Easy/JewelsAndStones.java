package Easy;

import java.util.HashMap;

public class JewelsAndStones {

    public static void main(String[] args) {
        numJewelsInStones("aA", "aAAbbbb"
        );
    }

    static public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < jewels.length() ; i++) {
            Character s=jewels.charAt(i);
            if (!map.containsKey(jewels.charAt(i)))
                map.put(jewels.charAt(i), 1);
        }

        int sum = 0;
        for (int i = 0; i < stones.length() - 1; i++) {
            if(map.containsKey(stones.charAt(i)))
            {
                sum++;
            }
        }
        return sum;
    }
}
