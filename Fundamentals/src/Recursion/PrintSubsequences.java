package Recursion;

import java.util.Scanner;

public class PrintSubsequences {
    public static void printSubsequences(String str,String outputSoFar){
        if (str.length() == 0){
            System.out.println(outputSoFar);
            return;
        }
        //We are not including the first character
        printSubsequences(str.substring(1),outputSoFar);
        //We are including the first character
        printSubsequences(str.substring(1),outputSoFar + str.charAt(0));
    }
    public static void printSubsequences(String str){
        printSubsequences(str,"");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        printSubsequences(str);
    }
}
