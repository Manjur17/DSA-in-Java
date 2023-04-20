package Maths;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int num = s.nextInt();
        int revNum=0;
        while (num > 0){
            int last = num % 10;
            revNum = revNum * 10 + last;
            num = num/10;
        }
        System.out.println("The reverse of the number is: " + revNum);
    }
}
