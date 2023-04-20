package BitManipulation;

import java.util.*;

public class PowerSet {
    public List<String> AllPossibleStrings(String s) {
        int n = s.length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    sb.append(s.charAt(j));
                }
            }
            if (sb.length() == 0) continue; //depending on question if empty subsequences is allowed or not

            list.add(sb.toString());
        }
        Collections.sort(list); //depending on question
        return list;
    }
}
