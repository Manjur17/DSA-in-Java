package Recursion;

import java.util.Scanner;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(remove(str));
        System.out.println(removeDo(str));
    }

    private static String modify(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int i = 0;

        while (i < n) {
            int j = i + 1;

            if (j < n && s.charAt(i) == s.charAt(j)) {
                //if the adjacent chars are equals check up to where they are same
                while (j < n && s.charAt(i) == s.charAt(j))
                    j++;
            } else {
                //add it to the ans
                ans.append(s.charAt(i));
            }

            i = j; //skip the equal char or move ahead
        }

        return ans.toString();
    }

    private static String remove(String str) {
        String ans = "";
        while (ans.length() != str.length()) {
            //check if further modification is possible
            ans = str;
            str = modify(str);
        }
        return str;
    }

    //acciojob
    private static String removeDo(String str) {
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            int j = i + 1;
            while (j < str.length() && str.charAt(i) == str.charAt(j)) {
                j++;
            }
            if (j != i + 1) {
                flag = 1; //duplicate found
                str = str.substring(0, i) + str.substring(j);
                i = j - 1;
            }
        }
        if (flag == 0) return str;

        return removeDo(str);

    }
}
