package Strings;

import java.util.Scanner;

public class AllTheDuplicatesInTheInputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        fillCharCounts(str);
    }

    static void fillCharCounts(String s) {
        int[] arr = new int[256];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 1) {
                System.out.println((char) (i) + " " + arr[i]);
            }
        }
    }
}
