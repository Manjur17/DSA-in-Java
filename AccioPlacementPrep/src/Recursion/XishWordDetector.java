package Recursion;

import java.util.Scanner;

public class XishWordDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String xStr = sc.next();
        System.out.println(isXish(str,xStr));
    }

    private static boolean isXish(String str, String xStr) {
        if (xStr.length() == 0){
            return true;
        }

        char ch = xStr.charAt(0);
        if (str.contains(String.valueOf(ch))){
           return isXish(str,xStr.substring(1));
        }
        return false;
    }
}
