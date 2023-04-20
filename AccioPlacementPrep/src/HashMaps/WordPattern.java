package HashMaps;

import java.util.HashMap;
import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.nextLine();
        String s = sc.nextLine();
        System.out.println(wordPattern(pattern, s));
    }

    public static boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        if (arr.length != pattern.length()) {
            return false;
        }

        HashMap<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String str = arr[i];
            if (map.containsKey(ch)) {
                String s1 = map.get(ch);
                if (!s1.equals(str)) return false;
            } else {
                if (!map.containsValue(str))
                    map.put(ch, str);
                else
                    return false;
            }
        }

        return true;
    }
}
