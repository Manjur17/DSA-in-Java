package Recursion;

import java.util.Scanner;

public class ReplaceCharacterRecursively {
    public static String replaceChar(String str,char c1,char c2){
        if (str.length() == 0){
            return str;
        }
        String ans = "";
        if (str.charAt(0) == c1){
            ans += c2;
        }else {
            ans += str.charAt(0);
        }
        return ans + replaceChar(str.substring(1),c1,c2);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("Enter the character you want to replace:");
        char c1 = s.next().charAt(0);
        System.out.println("Enter the character you want to add:");
        char c2 = s.next().charAt(0);
        System.out.println("The updated string is: " + replaceChar(str,c1,c2));
    }
}
