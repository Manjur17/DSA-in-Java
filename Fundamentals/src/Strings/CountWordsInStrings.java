package Strings;

import java.util.Scanner;

public class CountWordsInStrings {
    public static int countWords(String str){
        if( str.length() == 0){
            return 0;
        }
        int spaces = 1;
        for (int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == ' ') {
                spaces++;
            }
        }
        return spaces;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str =s.nextLine();
        int count = countWords(str);
        System.out.println("The Total number of words present in the string. is: " + count);
    }
}
