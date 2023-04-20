package Strings;

import java.util.Scanner;

public class StringWithASCIIdifferenceOfCharacters {
    public static String asciiDifference(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            //current character - previous character
            int diff = str.charAt(i) - str.charAt(i-1);
            sb.append(diff).append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String ans = asciiDifference(str);
        System.out.println(ans);
    }
}
