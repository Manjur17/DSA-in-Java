package Strings;

import java.util.Scanner;

public class CheckStringRotation {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(areRotations(s1, s2));
    }

    public static int areRotations(String s1, String s2) {
        if (s1.length() != s2.length())
            return 1;

        String str = s1 + s1; //KMP Algo
        if (str.contains(s2))
            return 1;
        else
            return 0;
    }
}
