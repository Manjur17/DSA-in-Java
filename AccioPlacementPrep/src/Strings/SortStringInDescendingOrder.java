package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortStringInDescendingOrder {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        Character[] ch = new Character[str.length()];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        Arrays.sort(ch, Collections.reverseOrder());
        StringBuilder ans = new StringBuilder();
        for (Character character : ch) {
            ans.append(character);
        }
        System.out.println(ans);
    }
}
