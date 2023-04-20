package Recursion;

import java.util.Scanner;

public class ReplacePi {
    public static String replacePi(String str){
        if (str.length() <= 1){
            return str;
        }
        String ans = "";
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'){
            ans += "3.14" + replacePi(str.substring(2));
        }else {
            ans += str.charAt(0) + replacePi(str.substring(1));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("The updated string is: " + replacePi(str));
    }
}
