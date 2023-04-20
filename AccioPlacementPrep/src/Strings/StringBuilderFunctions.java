package Strings;

import java.util.Scanner;

public class StringBuilderFunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        str.deleteCharAt(3);
        s = str.toString();
        System.out.println(s);
        str.deleteCharAt(1);
        s = str.toString();
        System.out.println(s);

    }
}
