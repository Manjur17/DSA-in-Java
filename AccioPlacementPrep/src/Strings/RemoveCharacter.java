package Strings;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        char target = s.next().charAt(0);
        System.out.println(removeCharacter(str,target));
        System.out.println(removeCharacter2(str,target));
    }
    public static String removeCharacter(String str,char target){
        String s = "" + target;
        return str.replace(s,"");
    }
    public static String removeCharacter2(String str,char target){
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != target){
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
