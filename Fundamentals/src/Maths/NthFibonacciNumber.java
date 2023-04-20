package OperatorsAndForLoop;
import java.util.Scanner;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int n=s.nextInt();
        int a=0,b=1;
        int i= 2;
//        for (int i=1; i<=n; i++)
//        {
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        System.out.print("The Nth number of the series is: " + a);
         while (i <=n){
             int temp = b;
             b = b + a;
             a = temp;
             i++;
         }
        System.out.print("The Nth number of the series is: " + b);
    }

}
