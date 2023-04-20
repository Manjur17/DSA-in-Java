package Strings;

import java.util.Scanner;

public class CheckPermutation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine();
        String s2 = s.nextLine();
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {

        int[] frequency = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
        }

        for (int i = 0; i < s2.length(); i++) {
            frequency[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
