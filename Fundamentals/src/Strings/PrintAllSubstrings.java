package Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    //Approach 1(printing them index wise)
    public static void printSubstrings(String str) {
        for (int start = 0; start < str.length(); start++){
            for (int end = start+1; end <= str.length(); end++){
                System.out.println(str.substring(start, end));
            }
        }
    }

    //Approach 2(printing them length wise)
    public static void printSubstring2(String str) {
        int n = str.length();
        for (int len = 1; len <= n; len++) {
            for (int start = 0; start <= n - len; start++) {
                int end = start + len - 1;
                System.out.println(str.substring(start, (end + 1)));
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        printSubstrings(str);
        System.out.println();
        printSubstring2(str);
    }
}
