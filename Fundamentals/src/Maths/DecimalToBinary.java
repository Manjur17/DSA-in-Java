package OperatorsAndForLoop;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int num = n;
        int binNum = 0, placeValue = 1;
        while (n>0){
            int rem = n%2;
            binNum += rem*placeValue;
            placeValue *= 10;
            n = n/2;
        }
        System.out.println("The binary of number " + num + " is " + binNum);
    }
}