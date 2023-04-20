package Strings;

import java.util.Scanner;

public class ReverseAString {
    public static String reverseString(String str) {
        if (str == null || str.length() == 0) {
            return ""; //Empty String
        }
        //Approach 1
        StringBuilder revString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            revString.append(str.charAt(i));
        }
        return revString.toString();
    }

    public static String reverseString1(String str) {
        if (str == null || str.length() == 0) {
            return ""; //Empty String
        }
        //Approach 2
        StringBuilder revString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            revString.insert(0, str.charAt(i)); //Adding last character to first
        }
        return revString.toString();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String revAns = reverseString(str);
        String revAns1 = reverseString1(str);
        System.out.println("The reverse of String from approach 1 is: " + revAns);
        System.out.println("The reverse of String from approach 2 is: " + revAns1);
    }
}
