package Recursion;

import java.util.Scanner;

public class RemoveDuplicatesRecursively {
    public static String removeChar(String str,char x){
       if (str.length() == 0){
           return str;
       }
       String ans = "";
       if (str.charAt(0) != x){
           ans += str.charAt(0);
       }

       return ans + removeChar(str.substring(1),x);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("Enter the character you want to remove:");
        char c = s.next().charAt(0);
        System.out.println("The updated string is: " + removeChar(str,c));
    }
}
