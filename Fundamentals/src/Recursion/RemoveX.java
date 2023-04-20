package Recursion;

import java.util.Scanner;

public class RemoveX {
    public static String removeX(String str){
        if (str.length() == 0){
            return str;
        }
        String ans = "";
        if (str.charAt(0) != 'x'){
            ans += str.charAt(0);
        }
        return ans + removeX(str.substring(1));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("The updated string is: " + removeX(str));
    }
}
