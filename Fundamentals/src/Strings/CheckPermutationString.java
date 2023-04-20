package Strings;

import java.util.Scanner;

public class CheckPermutationString {
    public static boolean checkPermutation(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        int[] frequency = new int[256]; // 256 because we have 255 unique set of character
        for (int i = 0; i < str1.length(); i++){
            frequency[str1.charAt(i)]++;
        }
        for (int i = 0; i < str2.length(); i++){
            frequency[str2.charAt(i)]--;
        }
        for (int i = 0; i < frequency.length; i++){
            if (frequency[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str1 =s.nextLine();
        String str2 = s.nextLine();
        boolean isPermutation = checkPermutation(str1,str2);
        System.out.println(isPermutation);
    }
}
