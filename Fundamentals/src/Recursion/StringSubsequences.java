package Recursion;

import java.util.Scanner;

public class StringSubsequences {
    public static String[] findSubsequences(String str){
      if (str.length() == 0){
          return new String[]{""};
      }
      String[] smallAns = findSubsequences(str.substring(1));
      String[] ans = new String[2 * smallAns.length];
      //Copy Content of smallAns to ans
        for (int i = 0; i < smallAns.length; i++){
            ans[i] = smallAns[i];
        }

      //Concat char at first index to content of the smallAns
        for (int i = 0; i < smallAns.length; i++){
            ans[i + smallAns.length] = str.charAt(0) + smallAns[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = s.nextLine();
        String[] ans = findSubsequences(str);
        for (String x: ans){
            System.out.print(x + " ");
        }
    }
}
