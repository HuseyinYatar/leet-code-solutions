package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Subdomain_Visit_Count_811 {
    public static void main(String[] args) {
        System.out.println(subdomainVisits(new String[]
                {"654 yaw.lmm.ca","1225 lmm.ca"}));
    }

    public static List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String s : cpdomains) {
            String substring = s.substring(s.indexOf(' ') + 1);
            int visitCount = Integer.parseInt(s.substring(0, s.indexOf(' ')));

            if(map.containsKey(substring))
                map.put(substring, map.get(substring) + visitCount);

            map.put(substring, visitCount);
            while (substring.contains(".")) {
                int i = substring.indexOf(".") + 1;
                substring = substring.substring(i);
                if (map.containsKey(substring)) map.put(substring, map.get(substring) + visitCount);
                else map.put(substring, visitCount);
            }

        }
        List<String> res = new ArrayList<>();
        map.forEach((key, values) ->
        {
            res.add(String.format("%d %s",values,key));
        });
        return res;
    }
}
