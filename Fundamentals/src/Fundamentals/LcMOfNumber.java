package Fundamentals;

import java.util.Scanner;

public class LcMOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the two numbwers:");
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int max= Math.max(n1, n2);
        while (true){
            if (max % n1 == 0 && max % n2 == 0){
                System.out.print("The Lcm of " + n1 + " and " + n2 + " is:  " + max);
                break;
            }
            ++max;
        }
    }
}
