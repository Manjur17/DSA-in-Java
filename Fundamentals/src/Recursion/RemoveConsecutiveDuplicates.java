package Recursion;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeChar(String str){
        if (str.length() <= 1){
            return str;
        }
        String ans = "";
        if (str.charAt(0) != str.charAt(1)){
            ans += str.charAt(0);
        }
        return ans + removeChar(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("The updated string is: " + removeChar(str));
    }
}
