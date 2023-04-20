package Fundamentals;

import java.util.Scanner;

public class GcDOfNumber {
    public static void GcDNumber(int n1,int n2){
        int gcd=1;
        for (int i=1; i<= n1 && i<= n2; ++i){
               //Check if i is a factor of both n1 and n2
            if (n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        System.out.print("The GCD of two numbers using function is: " + gcd + "\n");
    }

    public static void GcdNumber1(int num1, int num2){
        while (num1 != num2)
        {
            // if num1 is greater than num2, returns the num1.
            if (num1 > num2)
            {
                num1 = num1 - num2;
            }
            // otherwise, it returns the num2.
            else
            {
                num2 = num2 - num1;
            }

        }
        // print the GCD of the number.
        System.out.print("The GCD of two numbers using 2nd function is: " + num2);
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the two numbwers:");
        int n1=s.nextInt();
        int n2=s.nextInt();
        int x=n1,y=n2;
        while(n1 % n2 !=0){
            int rem=n1 % n2;
            n1= n2;
            n2 = rem;
        }
        int gcd= n2;
        int lcm= (x * y)/gcd;
        System.out.print("The GCD of two numbers using main is: " + gcd + "\n");
        System.out.print("The LCM of two numbers using main is : " + lcm + "\n");
        GcDNumber(n1,n2);
        GcdNumber1(n1,n2);
    }
}
