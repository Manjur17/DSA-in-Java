package Strings;

import java.util.Scanner;

public class DoubleTheEs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countE = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') countE++;
        }
        StringBuilder ans = new StringBuilder(str);
        for (int i = 0; i < countE; i++) {
            ans.insert(1, "e");
        }
        String result = str.replace("e","ee") ; //  maximum
        System.out.println(result);
        System.out.println(ans);
    }
}
