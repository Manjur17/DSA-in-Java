package Fundamentals;
import java.util.Scanner;
public class CharExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        char c=str.charAt(0);  //c stores character of index o of string str
        char ch=str.charAt(1);  //ch  stores character of index 1 of string str
        System.out.println(c);
        System.out.println(ch);
    }
}

