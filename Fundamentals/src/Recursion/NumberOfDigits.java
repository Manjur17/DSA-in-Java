package Recursion;

import java.util.Scanner;

public class NumberOfDigits {
    public static int getNum(int n,int count){
        if (n == 0){
            return count;
        }
        return getNum(n/10,count + 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int count = 0;
        System.out.println("The number of digits are: " + getNum(n,count));
    }
}
