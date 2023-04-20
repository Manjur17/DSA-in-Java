package OperatorsAndForLoop;

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=sc.nextInt();
        int sumEven=0, sumOdd=0;
        while (n > 0){
            int i=10;
            int rem= n % 10;     //way of getting last digit of a number
            int quo= n/10;      //way of getting number excluding the last digit
            if(rem % 2 == 0){
                sumEven += rem;
            }else {
                sumOdd += rem;
            }
            n= quo;
        }
        System.out.println("The Sum of even digits are: " + sumEven);
        System.out.println("The Sum of odd digits are: " + sumOdd);
    }
}
