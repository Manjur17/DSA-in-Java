package Strings;

import java.util.Scanner;

public class ReverseStringWordWise {
    public static String reverseString(String str) {
        if (str.length() == 0) {
            return ""; //Empty String
        }
        //First Reverse the entire given string
        StringBuilder revString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            revString.insert(0, str.charAt(i)); //Adding last character to first
        }
        return revString.toString();
    }
    //The reveres each word of the reversed string
    public static String reverseEachWordWise(String str) {
        if (str.length() == 0) {
            return ""; //Empty String
        }
        StringBuilder revAns = new StringBuilder();
        int currentWordStarts = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                //reverse the word
                StringBuilder revWord = new StringBuilder();
                for (int j = currentWordStarts; j < i; j++) {
                    revWord.insert(0, str.charAt(j));
                }
                revAns.append(revWord).append(" ");
                currentWordStarts = i + 1;
            }
            if (i == str.length() - 1) {
                //reverse the word
                StringBuilder revWord = new StringBuilder();
                for (int j = currentWordStarts; j <= i; j++) {
                    revWord.insert(0, str.charAt(j));
                }
                revAns.append(revWord);
            }
        }
            return revAns.toString();

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String revAns = reverseString(str);
        String revAnswer = reverseEachWordWise(revAns);
        System.out.println("The reverse of String from approach 1 is: " + "\n" + revAnswer);
    }
}
