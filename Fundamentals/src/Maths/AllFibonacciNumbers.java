package OperatorsAndForLoop;
import java.util.Scanner;
public class AllFibonacciNumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Nth number:");
        int n = s.nextInt();
        int a = 0, b = 1,i = 2;
        System.out.println("All the Numbers that occur in the range 0 to N (both inclusive) are:");
        System.out.print(a+ " " + b + " ");
        while (b<=n){
            int temp = b;
            b = a+b;
            a = temp;
            System.out.print(a + " ");
        }
//        for (int i = 2; i <= n; i++) {
//            int temp = b;
//            b = a+b;
//            a = temp;
//            System.out.print(b + " ");
//        }
    }
}
