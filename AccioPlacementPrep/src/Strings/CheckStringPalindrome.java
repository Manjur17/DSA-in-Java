package Strings;

import java.util.Scanner;

public class CheckStringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int i = 0,j = str.length()-1;
        boolean flag = true;
        while (i<j){
            if (str.charAt(i) != str.charAt(j)){
                flag = false;
                break;
            }
            i++;
            j--;
        }
        if (flag){
            System.out.println(str + " is a palindromic string");
        }else{
            System.out.println(str + " is not a palindromic string");
        }
    }
}
