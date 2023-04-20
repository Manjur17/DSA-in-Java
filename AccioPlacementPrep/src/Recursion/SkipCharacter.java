package Recursion;

import java.util.Scanner;

public class SkipCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(skipReturn(str));
        skipPrint(str, "");
    }

    private static String skipReturn(String str) {
        if (str.length() == 0) {
            return "";
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            //skip it
            return skipReturn(str.substring(1));
        }
        return ch + skipReturn(str.substring(1));
    }

    private static void skipPrint(String str, String ans) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        if (ch == 'a') {
            //skip it
            skipPrint(str.substring(1), ans);
        } else {
            skipPrint(str.substring(1), ans + ch);
        }
    }

}
