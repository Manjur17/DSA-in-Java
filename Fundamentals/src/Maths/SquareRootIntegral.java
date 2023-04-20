package OperatorsAndForLoop;

import java.util.Scanner;

public class SquareRootIntegral {
    public static void squareRoot(int n){
        int number=0; int sq_new=0;
        while(sq_new <= n){
            sq_new = number * number;
            number++;
        }
        System.out.println("The integral part of square root of N due to function: " + (number-2));
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=s.nextInt();
        int output = 0; //0 not 1 because of constraints
        while (output * output <= n){
            output++;
        }
        output = output-1;
        System.out.println("The integral part of square root of N due to main: " + output);
        squareRoot(n);

    }
}
