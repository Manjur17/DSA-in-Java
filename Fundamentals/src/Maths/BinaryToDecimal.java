package OperatorsAndForLoop;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s.nextInt();
        int num = n;
        // multiply last digit of binary number by its place value
        int decNum = 0,placeValue = 1;
        while (n>0){
            int lastDigit = n%10;
            decNum= decNum + lastDigit*placeValue;
            placeValue *= 2; //updating the place value
            n=n/10;
        }
        System.out.println("The decimal of binary number " + num + " is " + decNum);
    }
}
