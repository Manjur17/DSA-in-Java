package OperatorsAndForLoop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        int n = s.nextInt();
        for (int i = 100;i < 1000;i++){
            if (isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
//        System.out.println(isArmstrong(n));
    }
    public static boolean isArmstrong(int n){
        int sum = 0, temp = n;
        while (n > 0){
            int rem = n % 10;
            sum += rem * rem * rem;
            n = n /10;
        }
        return sum == temp;
    }
}
