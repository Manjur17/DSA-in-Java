package Strings;

import java.util.Scanner;

public class MergeTwoStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.nextLine();
        String str2 = s.nextLine();
        mergeString(str1, str2);
    }

    private static void mergeString(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int i = 0, j = 0;
        while (i < s1.length() && j < s2.length()) {
            ans.append(s1.charAt(i)).append(s2.charAt(j));
            i++;
            j++;
        }

        while (i < s1.length()){
            ans.append(s1.charAt(i));
            i++;
        }

        while (j < s2.length()){
            ans.append(s2.charAt(j));
            j++;
        }
        System.out.println(ans);
    }
}
