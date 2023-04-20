package Strings;

import java.util.Scanner;

public class CompressString {
    public static String compressString(String str){
        //O(N^2) time complexity
        if(str.length() == 0){
            return str;
        }
        int startUniqueIndex =0; String ansStr="";
        while (startUniqueIndex < str.length()){
            int count = 1;
            char unique = str.charAt(startUniqueIndex);
            int nextStartUniqueIndex = startUniqueIndex + 1;
            while (nextStartUniqueIndex < str.length() && str.charAt(nextStartUniqueIndex) == unique){
                nextStartUniqueIndex++;
                count++;
            }
            ansStr += unique;
            if(count > 1) {
                ansStr += count;
            }
            startUniqueIndex = nextStartUniqueIndex;
        }
        return ansStr;
    }
    //more optimized
    public static String compressString1(String str){
        //O(N) time complexity
        if(str.length() == 0){
            return str;
        }
        String ansStr="";int count = 1;
        ansStr += str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            }else{
                if(count>1){
                    ansStr += count;
                    count = 1;
                }
                ansStr += str.charAt(i);
            }
        }
        if(count>1){
            ansStr += count;
        }
        return ansStr;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String ans = compressString(str);
        System.out.println("The the updated string is from approach 1 is: " + "\n" + ans);
        String ans1 = compressString1(str);
        System.out.println("The the updated string is from approach 1 is: " + "\n" + ans1);
     }
}
