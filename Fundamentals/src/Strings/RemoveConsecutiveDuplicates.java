package Strings;

import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        if(str.length() == 0){
            return str;
        }
        //Approach 1
        String updateStr = "";
        int i;
        for ( i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) != str.charAt(i+1)){
                updateStr += str.charAt(i);
            }
        }
        if( i == str.length()-1){
            updateStr += str.charAt(i);
        }
        return updateStr;
    }
    public static String removeConsecutiveDuplicates1(String str){
        if(str.length() == 0){
            return str;
        }
        //Approach 2
        int startUniqueIndex =0;String ansStr="";
        while (startUniqueIndex < str.length()){
            char unique = str.charAt(startUniqueIndex);
            int nextStartUniqueIndex = startUniqueIndex + 1;
            while (nextStartUniqueIndex < str.length() && str.charAt(nextStartUniqueIndex) == unique){
                nextStartUniqueIndex++;
            }
            ansStr += unique;
            startUniqueIndex = nextStartUniqueIndex;
        }
        return ansStr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println("The the updated string is from approach 1 is: " + "\n" + ans);
        String ans1 = removeConsecutiveDuplicates1(str);
        System.out.println("The the updated string is from approach 12 is: " + "\n" + ans1);
    }
}
