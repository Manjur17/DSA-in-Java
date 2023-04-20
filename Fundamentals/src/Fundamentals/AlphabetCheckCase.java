package Fundamentals;

import java.util.Scanner;

public class AlphabetCheckCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().trim().charAt(0);

        if (c >= 'a' && c <= 'z') {
            System.out.println("lowercase");
        }else {
            System.out.println("uppercase");
        }
    }
}
