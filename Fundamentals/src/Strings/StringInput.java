package Strings;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str;
        //Reads First Token
        str = s.next();
        System.out.println(str + " " + str.length());
        //Reads Second Token
        String str2 = s.next();
        System.out.println(str2 + " " + str2.length());
        //Reads next integer
        int i = s.nextInt();
        System.out.println(i);
        //nextLine()
        int j = s.nextInt();
        String s1 = s.nextLine();
        System.out.println(j + s1 + " " + s1.length());

    }
}
