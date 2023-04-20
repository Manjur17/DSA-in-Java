package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        printSubsequence(str, "");
//        System.out.println();
//        System.out.println(returnSubsequence(str, ""));
        ArrayList<String> list = new ArrayList<>();
        returnSubsequence("", str, list);
        System.out.println(list);
        // System.out.println(returnSubsequence(str));
    }

    private static void printSubsequence(String str, String ans) {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        printSubsequence(str.substring(1), ans + ch); //take it
        printSubsequence(str.substring(1), ans); //leave it
    }

    private static ArrayList<String> returnSubsequence(String str, String ans) {
        if (str.length() == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        char ch = str.charAt(0);
        ArrayList<String> leftList = returnSubsequence(str.substring(1), ans + ch); //take it
        ArrayList<String> rightList = returnSubsequence(str.substring(1), ans); //leave it

        leftList.addAll(rightList);
        return leftList;
    }

    public static void returnSubsequence(String ans, String str, ArrayList<String> list) {
        if (str.length() == 0) {
            list.add(ans);
            return;
        }

        char ch = str.charAt(0);
        returnSubsequence(ans, str.substring(1), list);
        returnSubsequence(ans + ch, str.substring(1), list);
    }

    private static ArrayList<ArrayList<String>> returnSubsequence(String str) {
        ArrayList<ArrayList<String>> list = new ArrayList<>();
        helper(str, list, new ArrayList<>());
        return list;
    }


    private static void helper(String str, ArrayList<ArrayList<String>> list, ArrayList<String> ansList) {
        if (str.length() == 0) {
            list.add(new ArrayList<>(ansList));
//            list.add(ansList); -> this is wrong as this is adding reference variable
            return;
        }
        char ch = str.charAt(0);
        ansList.add(String.valueOf(ch));
        helper(str.substring(1), list, ansList);//take it
        ansList.remove(ansList.size() - 1);
        helper(str.substring(1), list, ansList); //leave it
    }
}
