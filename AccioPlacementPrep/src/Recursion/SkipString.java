package Recursion;

import java.util.Scanner;

public class SkipString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String key = sc.nextLine();
        System.out.println(skipReturn(str, key));
        System.out.println(skipAppNotApple(str));
    }

    private static String skipReturn(String str, String key) {
        if (str.length() == 0) {
            return "";
        }
        char ch = str.charAt(0);
        if (str.startsWith(key)) {
            //skip it
            return skipReturn(str.substring(key.length()), key);
        }
        return ch + skipReturn(str.substring(1), key);
    }

    private static String skipAppNotApple(String str) {
        if (str.length() == 0) {
            return "";
        }
        char ch = str.charAt(0);
        if (str.startsWith("app") && !str.startsWith("apple")) {
            //skip it
            return skipAppNotApple(str.substring(3));
        }
        return ch + skipAppNotApple(str.substring(1));
    }
}
