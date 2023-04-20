package Recursion;

import java.util.Scanner;

public class CountZeros {
    public static int countZeros(int n){
        int count = 0;
        if (n < 10) {
            if (n == 0) {
                return 1;
            }else{
                return 0;
            }
        }
        if (n % 10 == 0){
            ++count;
        }
        return count + countZeros(n / 10);
    }
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = s.nextInt();
        System.out.println("The no of zeros present are: " + countZeros(n));
    }
}
