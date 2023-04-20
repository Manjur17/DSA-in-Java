package HashMaps;

import java.util.*;

public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String pat = sc.next();
        System.out.println(isIsomorphic(pat, text));
    }

    public boolean isIsomorphicII(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>(); //<ch1,ch2>
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i), ch2 = t.charAt(i);
            if (map.containsKey(ch1)) {
                char ch = map.get(ch1);
                if (ch != ch2) return false;
            } else {
                if (!map.containsValue(ch2))
                    map.put(ch1, ch2);
                else
                    return false;
            }
        }

        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (s.lastIndexOf(s.charAt(i)) != t.lastIndexOf(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
