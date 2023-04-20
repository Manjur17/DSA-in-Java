package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSubsequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printSubsequences("",str);
        ArrayList<String> ansList = returnSubsequences("",str);
        System.out.print("\n" + ansList);
    }
    public static void printSubsequences(String ans,String str){
        if (str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        printSubsequences(ans,str.substring(1));
        printSubsequences(ans+ch,str.substring(1));
    }
    public static ArrayList<String> returnSubsequences(String ans, String str){
        if (str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> left = returnSubsequences(ans,str.substring(1));
        ArrayList<String> right = returnSubsequences(ans+ch,str.substring(1));
        left.addAll(right);
        return left;
    }
}
