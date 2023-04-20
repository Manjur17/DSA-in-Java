package Strings;

import java.util.Scanner;

public class ToggleCase {
    public static String toggleCase(String str) {
        StringBuilder temp = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                char ch = (char) ('A' + str.charAt(i) - 'a');
                temp.setCharAt(i, ch);
            } else {
                char ch = (char) ('a' + str.charAt(i) - 'A');
                temp.setCharAt(i, ch);
            }
        }
        return temp.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }
}
