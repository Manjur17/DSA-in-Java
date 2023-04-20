package Recursion;

import java.util.Scanner;

public class StringToInteger {
    //Method-1 From last to first
    public static int stringToInteger(String str) {
        if (str.length() == 1) {
            return (str.charAt(0) - '0');
        }
        int ans = stringToInteger(str.substring(1));
        int firstDigit = str.charAt(0) - '0';
        return (int) (firstDigit * Math.pow(10,str.length()-1) + ans);
    }
    //Method-2 From first to last
    public static int convertStrToInteger(String str){
        if (str.length() == 1) {
            return (str.charAt(0) - '0');
        }
        int ans = stringToInteger(str.substring(0,str.length() - 1));
        int lastDigit = str.charAt(str.length() - 1) - '0';
        return ans * 10 + lastDigit;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        System.out.println("The Corresponding integer value from Method-1 is: " + stringToInteger(str));
        System.out.println("The Corresponding integer value from Method-2 is: " + convertStrToInteger(str));
    }
}
