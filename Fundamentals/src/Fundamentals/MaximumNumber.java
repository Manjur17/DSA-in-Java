package Fundamentals;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//        System.out.println("The maximum is - " + max);
        int max = Math.max(c,Math.max(a,b));
        System.out.println("The maximum is - " + max);

  }
}
