package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class StringASCIISubsequences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printASCIISubsequences("",str);
        ArrayList<String> ansList = returnASCIISubsequences("",str);
        System.out.print("\n" + ansList);
    }
    public static void printASCIISubsequences(String ans,String str){
        if (str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        char ch = str.charAt(0);
        printASCIISubsequences(ans,str.substring(1));
        printASCIISubsequences(ans+ch,str.substring(1));
        printASCIISubsequences(ans+(ch+0),str.substring(1));
    }
    public static ArrayList<String> returnASCIISubsequences(String ans, String str){
        if (str.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> first = returnASCIISubsequences(ans,str.substring(1));
        ArrayList<String> second = returnASCIISubsequences(ans+ch,str.substring(1));
        ArrayList<String> third = returnASCIISubsequences(ans+(ch+0),str.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
