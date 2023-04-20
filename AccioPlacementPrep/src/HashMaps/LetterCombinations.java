package HashMaps;

import java.util.*;

public class LetterCombinations {
    public List<String> letterCombinations(String digits) {
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

    public void helper(String digits, List<String> list, int index, String word, HashMap<Character, String> map) { //using string for forming word so that in we dont have to remove last char while backtracking
        if (word.length() == digits.length()) {
            list.add(word);//if char[] had been used then we would have had to create new string
            return;
        }
        char c = digits.charAt(index);
        String keypad = map.get(c);
        for (int i = 0; i < keypad.length(); i++) {
            helper(digits, list, index + 1, word + keypad.charAt(i), map);
        }
    }
}
