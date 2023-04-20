package Maths;

import java.util.Scanner;

public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int inv =0,op = 1;
        while (n != 0){
            int od = n%10;
            inv += op * (int) Math.pow(10,od-1);
            op++;
            n /= 10;
        }
        System.out.println(inv);

    }
}
