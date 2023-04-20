package BackTracking;

import java.util.*;

public class PhonePadRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(letterCombinations(str));
    }

    public static List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> list = new ArrayList<>();

        if (digits.length() == 0) {
            return list;
        }

        helper(digits, list, 0, "", map);
        return list;
    }

    public static void helper(String digits, List<String> list, int index, String curr, HashMap<Character, String> map) {
        //using string for forming ans so that in we don't have to remove last char while backtracking
        if (curr.length() == digits.length()) {
            list.add(curr);//if char[] had been used then we would have had to create new string
            return;
        }

        char ch = digits.charAt(index);
        String keypad = map.get(ch);

        for (int i = 0; i < keypad.length(); i++) {
            helper(digits, list, index + 1, curr + keypad.charAt(i), map);
        }

    }
}
