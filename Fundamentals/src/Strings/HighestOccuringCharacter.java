package Strings;

import java.util.Scanner;

public class HighestOccuringCharacter {
    //Approach 1
    public static char highestOccurringChar(String str){
        int occur = 0; char c = '\0';
        for (int i =0; i < str.length()-1; i++){
            char mostOccur = str.charAt(i);
            int count = 1;
            for (int j = i+1; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            if( count > occur){
                occur = count;
                c = mostOccur;
            }
        }
        return c;
    }
    //Approach 2 - In one traversal find the frequency of occurence of a character and store/update it at the ASCII value of the character
    public static char highestOccurringCharacter(String str){
        int maxFrequency = 0;char c = '\0';
        int[] frequency = new int[256];
        for (int i =0; i < str.length(); i++) {
                frequency[str.charAt(i)]++;
                maxFrequency = Math.max(maxFrequency,frequency[str.charAt(i)]);
        }
        for (int i = 0; i < str.length(); i++){
            if (frequency[str.charAt(i)] == maxFrequency){
                c = str.charAt(i);
                break;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        char revAns = highestOccurringChar(str);
        System.out.println("The highest occurring character from approach 1 is: " + "\n" + revAns);
        char revAns1 = highestOccurringCharacter(str);
        System.out.println("The highest occurring character from approach 2 is: " + "\n" + revAns);
    }
}
