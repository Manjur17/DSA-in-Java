package Strings;

import java.util.Scanner;

public class RemoveAllOccurrencesOfASubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String part = s.next();
        System.out.println(removeOccurrences(str,part));
    }
    public static String removeOccurrences(String s, String part) {
        StringBuilder str = new StringBuilder(s);

        while (str.length() != 0  && str.indexOf(part) != -1){
              str.delete(str.indexOf(part), str.indexOf(part) + part.length());
        }

        return str.toString();
    }
}
