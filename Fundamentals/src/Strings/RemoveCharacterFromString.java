package Strings;

import java.util.Scanner;

public class RemoveCharacterFromString {
    public static String removeChar(String str, char x) {
        String ansStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != x){
                ansStr += str.charAt(i);
            }
        }
        return ansStr;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("Enter the character(X) (remove all the occurrences of X from the given string)");
        char x = s.next().charAt(0);
        String ansStr = removeChar(str,x);
        System.out.println("The updated string is: " + "\n" + ansStr);
    }
}