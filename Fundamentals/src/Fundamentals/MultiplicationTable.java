package Fundamentals;
import  java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        int n;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter The number:");
        n=s.nextInt();
        System.out.println("The  Multiplication Table of N:");
        for (int i=1; i <= 10; i++)
        {
            System.out.println(n+ "*" + i + "=" + n*i);
        }
    }
}
