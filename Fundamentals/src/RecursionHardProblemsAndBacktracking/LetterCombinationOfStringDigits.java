package RecursionHardProblemsAndBacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationOfStringDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        letterCombinations("",str);
        List<String> list = letterCombinationsReturn("",str);
        System.out.print("\n" + list);
        System.out.println();
        System.out.println(letterCombinationsCount("",str));
    }
    public static void  letterCombinations(String ans,String str){
        if (str.length() == 0){
            System.out.print(ans + " ");
            return;
        }
        int digits = str.charAt(0) - '0';
        if (digits != 9) {
            for (int i = (digits - 1) * 3; i < digits * 3; i++) {
                char charToAdd = (char) ('a' + i);
                letterCombinations(ans + charToAdd, str.substring(1));
            }
        }else {
            for (int i = (digits - 1) * 3; i < (digits * 3)-1; i++) {
                char charToAdd = (char) ('a' + i);
                letterCombinations(ans + charToAdd, str.substring(1));
            }
        }
    }
    public static List<String> letterCombinationsReturn(String ans,String digits) {
        if (digits.length() == 0){
            List<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        List<String> list = new ArrayList<>();
        int digit = digits.charAt(0) - '0';
        if (digit != 9) {
            for (int i = (digit - 1) * 3; i < digit * 3; i++) {
                char charToAdd = (char) ('a' + i);
                list.addAll(letterCombinationsReturn(ans + charToAdd, digits.substring(1)));
            }
        }else {
            for (int i = (digit - 1) * 3; i < (digit * 3)-1; i++) {
                char charToAdd = (char) ('a' + i);
                list.addAll(letterCombinationsReturn(ans + charToAdd, digits.substring(1)));
            }
        }
        return list;
    }
    public static int letterCombinationsCount(String ans,String str){
        if (str.length() == 0){
            return 1;
        }
        int digits = str.charAt(0) - '0';
        int count = 0;
        if (digits != 9) {
            for (int i = (digits - 1) * 3; i < digits * 3; i++) {
                char charToAdd = (char) ('a' + i);
                count += letterCombinationsCount(ans + charToAdd, str.substring(1));
            }
        }else {
            for (int i = (digits - 1) * 3; i < (digits * 3)-1; i++) {
                char charToAdd = (char) ('a' + i);
                count += letterCombinationsCount(ans + charToAdd, str.substring(1));
            }
        }
        return count;
    }
}
