package OperatorsAndForLoop;

import java.util.Scanner;

public class MemberOfFibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int a = 0, b = 1,c;
        while (b < n){
                int temp = b;
                b = a+b;
                a = temp;
        }
        if (b == n) {
                    System.out.println("The N is a part of the fibonacci sequence");
            } else {
            System.out.println("The N is not a part of the fibonacci sequence");
            }
        }
}
