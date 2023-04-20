package Strings;

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = "" + str.charAt(0);
        StringBuilder ans = new StringBuilder(s);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) ==  '-'){
                ans.append(str.charAt(i+1));
            }
        }
        System.out.println(ans);
    }
}
