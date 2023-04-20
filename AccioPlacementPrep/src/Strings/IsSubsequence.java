package Strings;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.next();
        System.out.println(isSubsequence(s1, "", s2));
    }

    private static boolean isSubsequence(String s1, String ans, String s2) {
        //naive -> exponential approach
        if (s1.length() == 0) {
            return ans.equals(s2);
        }
        char ch = s1.charAt(0);
        boolean ans1 = isSubsequence(s1.substring(1), ans + ch, s2); //take it
        boolean ans2 = isSubsequence(s1.substring(1), ans, s2); //leave it
        return ans1 || ans2;
    }

    private static boolean isSubsequence(String s1, String s2){
        int i = 0,j = 0;
        while (i < s1.length() && j < s2.length()){
            if (s1.charAt(i) == s2.charAt(j)){
                i++;
                j++;
            }else {
                i++;
            }
        }
        return  j == s2.length();
    }
}
