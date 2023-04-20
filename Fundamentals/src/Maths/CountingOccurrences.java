package OperatorsAndForLoop;

import java.util.Scanner;

public class CountingOccurrences {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Enter the number you wnt to search");
        int sNo = s.nextInt();
        int count = 0;
        while (n != 0){
            int l = n % 10;
            if (l == sNo){
                count++;
            }
            n = n / 10;
        }
        System.out.println("The total number of occurrence is: " + count);
    }
}
