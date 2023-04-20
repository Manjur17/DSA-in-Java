package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rev = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            rev.insert(0, str.charAt(i));
        }
        System.out.println(rev);
    }
}
