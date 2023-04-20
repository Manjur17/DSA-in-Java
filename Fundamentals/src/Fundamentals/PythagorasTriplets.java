package Fundamentals;

import java.util.Scanner;

public class PythagorasTriplets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max;
        if (a > b && a > c) {
            max=a;
            boolean flag = ((b * b) + (c * c)) == (a * a);
            System.out.println(flag);
        }
        else if(b > a && b >c){
            max=b;
            boolean flag = ((a * a) + (c * c)) == (b * b);
            System.out.println(flag);
        }else{
            max =c;
            boolean flag = ((b * b) + (a * a)) == (c * c);
            System.out.println(flag);
        }
    }
}
