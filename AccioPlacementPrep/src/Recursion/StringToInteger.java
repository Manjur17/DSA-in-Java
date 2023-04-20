package Recursion;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || (s.charAt(i) >= '1' && s.charAt(i) <= '9') ){
                str.append(s.charAt(i));
            }
        }
        s = str.toString();
        System.out.println(s);
        if (s.charAt(0) == '-') {
            int ans = convertToInteger(s.substring(1), s.length() - 2);
            return ans * (-1);
        }
        return convertToInteger(s, s.length() - 1);

    }

    private static int convertToInteger(String str, int i) {
        //we start from last and go to first and multiply with 10 + str[i]
        if (i == 0) {
            return str.charAt(i) - '0'; //first char
        }
        int ans = convertToInteger(str, i - 1);
        int a = str.charAt(i) - '0';
        return ans * 10 + a; //going up take this
    }
}
