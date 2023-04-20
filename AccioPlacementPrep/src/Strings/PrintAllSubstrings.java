package Strings;

import java.util.Scanner;

public class PrintAllSubstrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        printSubstrings(str);
        System.out.println();
        printSubstrings2(str);
    }

    private static void printSubstrings(String str) {
        //print them index wise
        for (int startIndex = 0; startIndex < str.length(); startIndex++) {
            for (int endIndex = startIndex; endIndex < str.length(); endIndex++) {
                System.out.print(str.substring(startIndex, endIndex + 1) + " ");
            }
        }
    }

    private static void printSubstrings2(String str) {
        //print them length wise
        for (int len = 1; len <= str.length(); len++) {
            for (int startIndex = 0; startIndex <= str.length() - len; startIndex++) {
                int endIndex = startIndex + len - 1;
                System.out.print(str.substring(startIndex, endIndex + 1) + " ");
            }
        }
    }
}
