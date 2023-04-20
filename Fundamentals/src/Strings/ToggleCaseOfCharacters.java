package Strings;

import java.util.Scanner;

public class ToggleCaseOfCharacters {
   public static String toogleCharacters(String str){
       StringBuilder sb = new StringBuilder(str);
       for (int i = 0; i < str.length(); i++) {
           if (sb.charAt(i) >= 'a' && sb.charAt(i)  <= 'z'){
               char uc = (char) ('A' + sb.charAt(i) - 'a');
               sb.setCharAt(i,uc);
           }else {
               char lc = (char) ('a' + sb.charAt(i) - 'A');
               sb.setCharAt(i,lc);
           }
       }
       return sb.toString();
   }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String ans = toogleCharacters(str);
        System.out.println(ans);
    }
}
