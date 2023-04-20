package Strings;

import java.util.Scanner;

public class LargestSubstring {
    public static String largestSubstring(String str){
        int startIndex = 0; String ans = "";
        while (startIndex < str.length()){
            char unique = str.charAt(startIndex);
            String temp = "" + unique;
            int nextIndex = startIndex + 1;
            for (int i = nextIndex; i > startIndex; i--) {
                while (str.charAt(nextIndex) != str.charAt(i-1)){
                    temp += str.charAt(i);
                    nextIndex++;
                }
            }
            if (ans.length() < temp.length()){
                ans = temp;
            }
            startIndex++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String ansStr = largestSubstring(str);
        System.out.println("The Largest substring is: " + " " + ansStr );
    }
}
