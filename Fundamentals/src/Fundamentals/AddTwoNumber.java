package Fundamentals;
import java.util.Scanner;
public class AddTwoNumber {
    public static void main(String[] args)
    {
        int a,b;
        Scanner s= new Scanner(System.in);
        System.out.println("Taking inputs from User");
        System.out.println("Enter the first number:");
        a=s.nextInt();
        System.out.println("Enter the second number:");
        b=s.nextInt();
        int c=a+b;
        System.out.print("The Sum of the number is: "+ c);
//        System.out.print(c);
    }
}
